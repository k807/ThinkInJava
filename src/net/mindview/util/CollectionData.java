package net.mindview.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * =============================================
 * 适配器模式
 * @author wu
 * @create 2018-06-17 21:20
 * =============================================
 */

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity){
        for(int i = 0; i < quantity; i++){
            add(gen.next());
        }
    }

    public static <T> CollectionData<T> list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen, quantity);
    }
}
