package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:51
 * =============================================
 */

/**
 * 模板方法模式
 * @param <T>
 */
abstract class GenericWithCreate<T>{
    final T element;
    GenericWithCreate(){
        element = create();
    }
    abstract T create();
}

class X{}
class Creator extends GenericWithCreate<X>{

    @Override
    X create() {
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}
public class CreatorGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
