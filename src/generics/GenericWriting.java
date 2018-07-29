package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 16:50
 * =============================================
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();
    static void f1(){
        writeExact(apples,new Apple());
        writeExact(fruit,new Apple());
    }
    static <T> void writeWithWildcar(List<? super T> list, T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildcar(apples,new Apple());
        writeWithWildcar(fruit,new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
