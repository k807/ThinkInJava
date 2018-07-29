package generics;

import net.mindview.util.Generator;

import java.util.*;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 20:04
 * =============================================
 */
interface Addable<T> {
    void add(T t);
}
public class Fill2 {
    public static <T> void fill(Addable<T> addable,Class<? extends T> classToken,int size){
        for(int i = 0; i < size; i ++){
            try {
                addable.add(classToken.newInstance());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size){
        for(int i = 0; i < size; i++){
            addable.add(generator.next());
        }
    }

}

class AddableCollectionAdapter<T> implements Addable<T>{
    private Collection<T> c;

    public AddableCollectionAdapter(Collection<T> c) {
        this.c = c;
    }


    @Override
    public void add(T t) {
        c.add(t);
    }
}

class Adapter{
    public static <T> Addable<T> collectionAdapter(Collection<T> c){
        return new AddableCollectionAdapter<T>(c);
    }
}
class SimpleQueue<T> implements Iterable<T>{
    private LinkedList<T> storage = new LinkedList<T>();
    public void add(T t){
        storage.offer(t);
    }
    public T get(){
        return storage.poll();
    }
    @Override
    public Iterator<T> iterator(){
        return storage.iterator();
    }
}
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
    @Override
    public void add(T item){
        super.add(item);
    }
}

class Fille2Test{
    public static void main(String[] args) {
        List<Cafe> carrier = new ArrayList<Cafe>();
        Fill2.fill(new AddableCollectionAdapter<Cafe>(carrier),Cafe.class,3);
        for(Cafe f : carrier){
            System.out.println(f);
        }
    }
}
