package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-23 15:31
 * =============================================
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF;//128MB

    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile(
                "G:/迅雷下载/googleearth_7.1.8.3036.exe","rw").getChannel()
                .map(FileChannel.MapMode.READ_WRITE,0,length);
        while(out.hasRemaining()){
            System.out.print(out.get());
        }
    }
}
