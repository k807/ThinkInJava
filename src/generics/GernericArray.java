package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 12:45
 * =============================================
 */
public class GernericArray<T> {
    private T[] array;
    public GernericArray(int sz){
        array = (T[]) new Object[sz];
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
        GernericArray<Integer> gai = new GernericArray<Integer>(10);
        Object[] ia = gai.rep();
    }
}
