package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:15
 * =============================================
 */
public class ListMaker<T> {
    List<T> create(){
        return new ArrayList<T>();
    }

}
