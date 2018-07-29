package net.mindview.util;

import sun.nio.cs.Surrogate;

import java.util.Collection;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 20:57
 * =============================================
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args) {

    }
}
