package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:32
 * =============================================
 */
class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter{
    /**
     * 协变返回类型
     * @return
     */
    @Override
    Derived get();
}
public class CovariantReturnTypes {
    void test(DerivedGetter d){
        Derived d2 = d.get();

    }
}
