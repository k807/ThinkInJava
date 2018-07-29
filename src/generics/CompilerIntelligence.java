package generics;

import java.util.Arrays;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 16:19
 * =============================================
 */
public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
