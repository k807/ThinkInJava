package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 11:06
 * =============================================
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item){
        array.add(item);
    }
    public T get(int index){
        return array.get(index);
    }
}
