package io;

import java.io.*;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-23 20:21
 * =============================================
 */
public class Blip implements Serializable {
    private static final long serialVersionUID = 1L;
    private int i;
    private String s;

    @Override
    public String toString() {
        return "Blip{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    public Blip(int i, String s) {
        System.out.println("Blip.Blip");
        this.i = i;
        this.s = s;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Blip bl = new Blip(123,"abc");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Blip.out"));
        oos.writeObject(bl);
        oos.close();

        System.out.println("getObject");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Blip.out"));
        Object obj = ois.readObject();
        System.out.println(((Blip)obj));
    }
}
