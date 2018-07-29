package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 12:48
 * =============================================
 */
public class GenericArray2<T> {
    private T[] array;
    public GenericArray2(int sz){
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){
        return (T[]) array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
        for(int i = 0; i < 10; i ++){
            gai.put(i,i);
        }

        for(int i = 0; i < 10; i++){
            System.out.print(gai.get(i) + "");
        }
        System.out.println();
        try {
            Integer[] ia = gai.rep();
        }catch (Exception e){
            System.out.println(e);
        }
    }


}
