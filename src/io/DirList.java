package io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-22 14:36
 * =============================================
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
//        if(args.length == 0){
//            list = path.list();
//        }
//        else{
//            list = path.list(new DirFilter(args[0]));
//        }
        DirFilter2 dirFilter2 = new DirFilter2();
        list = path.list(dirFilter2);
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            System.out.println(dirItem);
        }
        System.out.println();
        System.out.println(dirFilter2.getSize());
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regex){
        pattern =  Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name){
        return pattern.matcher(name).matches();
    }
}

class DirFilter2 implements FilenameFilter{
    private long size;

    public long getSize() {
        return size;
    }

    @Override
    public boolean accept(File dir, String name) {
        size += dir.length();
        return true;
    }
}