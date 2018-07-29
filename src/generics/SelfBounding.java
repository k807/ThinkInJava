package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:23
 * =============================================
 */
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get() {
        return element;
    }
}

class A extends SelfBounded<A>{}
class B extends SelfBounded<B>{}
class C extends SelfBounded<C>{
    C setAndGet(C arg){
        set(arg);
        return get();
    }
}
//class D extends SelfBounded<D>{}
//class E extends SelfBounded<D>{}
public class SelfBounding {
    public static void main(String[] args) {
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
