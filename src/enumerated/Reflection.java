package enumerated;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 12:55
 * =============================================
 */
enum Explore{HERE,THERE}
public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("----- Analyzing " + enumClass + " -----");
        System.out.println("Interfaces: ");
        for(Type t : enumClass.getGenericInterfaces()){
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for(Method m : enumClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);
        System.out.println(exploreMethods);

    }
}
