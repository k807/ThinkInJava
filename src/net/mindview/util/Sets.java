package net.mindview.util;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 21:11
 * =============================================
 */
public class Sets {
    /**
     * 并集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> union(Set<T> a , Set<T> b){
        Set<T> result = null;
        if(a instanceof EnumSet){
            result = ((EnumSet) a).clone();
        }else {
            result = new HashSet<>();
        }
        result.addAll(b);
        return result;
    }

    /**
     * 交集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> intersection(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    /**
     * 差集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> difference(Set<T> a, Set<T> b){
        Set<T> result = new HashSet<T>(a);
        result.removeAll(b);
        return result;
    }

    /**
     * 余集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> complement(Set<T> a, Set<T> b){
        return difference(union(a,b), intersection(a,b));
    }
}
