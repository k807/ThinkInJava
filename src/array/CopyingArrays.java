package array;

import java.util.Arrays;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 19:38
 * =============================================
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));
        System.arraycopy(i,0,j,0,i.length);
        System.out.println("j = " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k ,103);
        System.arraycopy(i,0,k,0,k.length);
        System.out.println("k = " + Arrays.toString(k));
        Arrays.fill(k,10);
        System.arraycopy(k , 0, i , 0 ,k.length);
        System.out.println("i = " + Arrays.toString(i));
        Integer[] u = new Integer[10];
    }
}
