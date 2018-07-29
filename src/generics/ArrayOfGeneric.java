package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 11:10
 * =============================================
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());

    }
}
