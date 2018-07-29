package io;

import java.io.*;
import java.util.zip.*;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-23 18:59
 * =============================================
 */
public class ZipCompress {
    public static void main(String[] args) throws IOException {
        FileOutputStream f= new FileOutputStream("test.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f,new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);
        zos.setComment("A test of Java Zipping");

        for(String arg : args){
            System.out.println("Writing file " + arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zos.putNextEntry(new ZipEntry(arg + "x"));
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
            out.flush();
        }
        out.close();
        System.out.println("Checksum: " + csum.getChecksum().getValue());
        System.out.println("Reading file");
        FileInputStream fi = new FileInputStream("test.zip");
        CheckedInputStream csumi = new CheckedInputStream(fi,new Adler32());
        ZipInputStream in2 = new ZipInputStream(csumi);
        BufferedInputStream bis = new BufferedInputStream(in2);
        ZipEntry ze;
        while ((ze = in2.getNextEntry()) != null){
            System.out.println("Reading file " + ze);
            int x;
            while ((x = bis.read()) != -1){
                System.out.println(x);
            }
        }
        if(args.length == 1){
            System.out.println("Checksum: " + csumi.getChecksum().getValue());
        }
        bis.close();
    }
}
