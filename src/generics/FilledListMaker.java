package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:17
 * =============================================
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n){
        List<T> result = new ArrayList<T>();
        for(int i = 0; i < n; i++){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
