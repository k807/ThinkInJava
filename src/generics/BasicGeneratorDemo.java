package generics;

import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 21:06
 * =============================================
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        //类型参数推断
        Generator<CountedObject> gen = new BasicGenerator<>(CountedObject.class);
        for(int i = 0; i < 5; i++){
            System.out.println(gen.next());
        }
    }
}
