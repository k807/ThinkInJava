package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:18
 * =============================================
 */
public class SimpleHolder {
    private Object object;
    public void set(Object obj){
        this.object = obj;
    }
    public Object get(){
        return object;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String)holder.get();
    }
}
