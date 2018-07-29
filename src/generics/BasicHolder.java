package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:13
 * =============================================
 */
public class BasicHolder<T> {
    T element;
    void set(T arg){ element = arg;}
    T get(){ return element;}
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }
}

class Subtype extends BasicHolder<Subtype>{}
class CRGWithBasicHolder{
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st1.f();
    }
}