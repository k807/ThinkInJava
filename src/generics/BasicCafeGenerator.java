package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:26
 * =============================================
 */
public class BasicCafeGenerator implements CafeGenerator {
    @Override
    public void process(Cafe cafe) {
        System.out.println("开始制作Cafe: " + cafe);
    }
}
