package search;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 20:17
 * =============================================
 */
public class SearcherTest {
    public static void main(String[] args) {
        Integer[] nums = Generated.generated(Integer.class,10,new RandomGenerator.Integer());
        System.out.println("nums : " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("nums : " + Arrays.toString(nums));
        BinarySearcher binarySearcher = new BinarySearcher();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            System.out.println("enter");
            System.out.println(binarySearcher.search(nums,Integer.parseInt(sc.nextLine())));
            sc.close();
            System.exit(0);
        }

    }
}
