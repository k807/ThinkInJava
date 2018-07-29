package io;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-22 14:44
 * =============================================
 */
public class DirList2 {
    //闭包的问题,要用final
    public static FilenameFilter filter(final String str){
        return new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(dir.isFile()){
                    FileReader fr = null;
                    char[] temp = new char[1024];
                    StringBuilder sb = new StringBuilder();
                    try {
                        fr = new FileReader(dir);
                        while(fr.read(temp)!= - 1){
                            sb.append(sb);
                        }
                    } catch (Exception e) {
                        return false;
                    } finally {
                        try {
                            fr.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return sb.toString().contains(name);
                }
                return false;
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length ==0){
            list = path.list();
        }else{
            list = path.list(filter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }

}
