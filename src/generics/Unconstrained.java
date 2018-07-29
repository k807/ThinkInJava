package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:20
 * =============================================
 */
class Other{}
class BasicOther extends BasicHolder<Other>{}
public class Unconstrained {
    public static void main(String[] args) {
        BasicOther b= new BasicOther(),b2 = new BasicOther();
        b.set(new Other());
        Other other = b.get();
        b.f();
    }
}
