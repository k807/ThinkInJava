package array;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 16:27
 * =============================================
 */
public class GeneratorsTest {
    public static int size = 10;
    public static void test(Class<?> surroundingClass){
        //获得所有内部类或内部成员
        for(Class<?> type : surroundingClass.getClasses()){
            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for(int i = 0; i< size; i++){
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        test(RandomGenerator.class);
    }
}
