package net.mindview.util;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 17:18
 * =============================================
 */
public class Generated {
    @SuppressWarnings("unchecked")
    public static <T> T[] generated(Class<T> type,int size,Generator<T> gen){
        T[] ret = (T[]) Array.newInstance(type,size);
        for(int i = 0; i < size;i++){
            ret[i] = gen.next();
        }
        return ret;
    }
}
