package io;

import java.io.File;
import java.io.IOException;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-22 19:13
 * =============================================
 */
public class ProcessFiles {
    public interface Strategy{
        void process(File file);
    }

    private Strategy strategy;
    private String ext;
    public ProcessFiles(Strategy strategy, String ext){
        this.strategy = strategy;
        this.ext = ext;
    }

    public void start(String[] args){
        try {
            if(args.length == 0){
                processDirectoryTree(new File("."));
            }else{
                for(String arg : args){
                    File fileArg = new File(arg);
                    if(fileArg.isDirectory()){
                        processDirectoryTree(fileArg);
                    }else {
                        if(!arg.endsWith("." + ext)){
                            arg += "." + ext;
                            strategy.process(new File(arg).getCanonicalFile());
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void processDirectoryTree(File root) throws IOException {
        for(File file : Directory.walk(root.getAbsolutePath(),".*\\." + ext)){
            strategy.process(file.getCanonicalFile());
        }
    }

    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy(){
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"class").start(args);
    }
}
