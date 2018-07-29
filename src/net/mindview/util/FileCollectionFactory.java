package net.mindview.util;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 12:48
 * =============================================
 */
public class FileCollectionFactory implements CollectionFactory<String> {
    @Override
    public Collection<String> create(String arg) {
        File file = new File(arg);
        char[] chars = new char[1024];
        StringBuilder sb = new StringBuilder();
        Reader r = null;
        try {
            r = new FileReader(file);
            while(r.read(chars) != - 1){
                sb.append(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                r.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Arrays.asList(sb.toString().split(" "));
    }

    public static void main(String[] args) {
        FileCollectionFactory fcf = new FileCollectionFactory();
        for(String s : fcf.create("G:/a.txt")){
            System.out.print(" " + s);
        }
    }
}
