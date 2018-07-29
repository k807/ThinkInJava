package generics;

import java.util.HashMap;
import java.util.Map;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:31
 * =============================================
 */
class Building{}
class House extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;
    Map<String,Class<?>> map;

    public ClassTypeCapture(){
        map = new HashMap<>();
    }
    public ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }

    public void addType(String typename,Class<?> kind){
        map.put(typename,kind);
    }

    public <O> O createNew(String typename){
        try {
            return (O) map.get(typename).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean f(Object arg){
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> cttl = new ClassTypeCapture<Building>(Building.class);
        System.out.println(cttl.f(new Building()));
        System.out.println(cttl.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}
