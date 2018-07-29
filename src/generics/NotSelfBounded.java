package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:29
 * =============================================
 */
public class NotSelfBounded<T> {
    T element;
    NotSelfBounded<T> set(T arg){
        element = arg;
        return this;
    }
    T get(){
        return element;
    }

    static <T extends SelfBounded<T>> T f(T arg){
        return arg.set(arg).get();
    }
}

class A2 extends NotSelfBounded<A2>{}
class B2 extends NotSelfBounded<A2>{}
