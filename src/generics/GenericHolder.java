package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:26
 * =============================================
 */
public class GenericHolder<T> {
    private T obj;
    public void set(T obj){
        this.obj = obj;
    }
    public T get(){ return obj;}

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<String>();
        holder.set("Item");
        String s = holder.get();
    }
}
