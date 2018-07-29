package generics;

import java.lang.reflect.Array;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 12:53
 * =============================================
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;
    public GenericArrayWithTypeToken(Class<T> type, int sz){
        array = (T[]) Array.newInstance(type,sz);
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class,10);
        Integer[] ia = gai.rep();

    }
}
