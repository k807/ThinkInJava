package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 21:04
 * =============================================
 */
public class CountedObject {
    private static long count = 0;
    private final long id = count++;
    public long id() { return id;}

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}
