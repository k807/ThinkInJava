package net.mindview.contain;

import net.mindview.annotation.Transaction;

import java.io.*;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-19 20:52
 * =============================================
 */
public class SimpleTransaction implements FileTask {
    @Override
    public void process(File file) throws Exception {
        Writer writer = new FileWriter(file);
        writer.write(" this is SimpleTransaction");
        Writer fos = null;
        try {
            fos = new FileWriter(file);
            fos.write("aa bb cc dd ee");
            throw new Exception();
        }catch (Exception e){
            throw e;
        }finally {
            fos.close();
        }
    }     
}
