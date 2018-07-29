package generics;

import java.lang.reflect.InvocationTargetException;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 22:55
 * =============================================
 */
class K{
    K(String arg){
        System.out.println("arg : " + arg);
    }
}

class ReflectGeneric<T>{
    T t;

    public ReflectGeneric(Class<T> type) {
        try {
            t = type.getDeclaredConstructor(String.class).newInstance("this is args");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
public class ReflectGenericCreate {
    public static void main(String[] args) {
        ReflectGeneric<K> reflectGeneric = new ReflectGeneric<>(K.class);
    }
}
