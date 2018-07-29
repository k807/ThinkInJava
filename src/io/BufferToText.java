package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-23 13:46
 * =============================================
 */
public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        //直接写直接读，会出现乱码,getBytes默认使用file.encoding指定的编码
        FileChannel fc = new FileOutputStream("data2.txt").getChannel();
        System.out.println("defaultCharset: " + Charset.defaultCharset().name());
        fc.write(ByteBuffer.wrap("some text".getBytes()));
        System.out.println("binary code:" + Arrays.toString("some text".getBytes()));
        fc.close();
        fc = new FileInputStream("data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        System.out.println(buff.asCharBuffer().getClass().getSimpleName());
        System.out.println("---------------------------");

        //解码再读，正常读出
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("binary code:" + Arrays.toString(Charset.forName(encoding).decode(buff).array()));
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));

        System.out.println("---------------------------");
        fc = new FileOutputStream("data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());

        System.out.println("---------------------------");
        fc = new FileOutputStream("data2.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("some text");
        fc.write(buff);
        fc.close();
        fc = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        System.out.println("---------------------------");
    }
}
