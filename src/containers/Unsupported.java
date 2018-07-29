package containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 13:54
 * =============================================
 */
public class Unsupported {
    static void test(String msg, List<String> list){
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1,8);
        Collection<String> c2 = new ArrayList<String>(subList);
    }
}
