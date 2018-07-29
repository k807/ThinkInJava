package generics;

import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 16:48
 * =============================================
 */
public class SuperTypeWildcards {
    static void writeTo(List<? super Apple> apples){
        apples.add(new Apple());
        apples.add(new Jonathan());
//        apples.add(new Fruit());
    }
}
