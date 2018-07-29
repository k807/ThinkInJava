package net.mindview.util;

import java.util.LinkedHashMap;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 21:32
 * =============================================
 */
public class MapData<K,V> extends LinkedHashMap<K,V> {
    public MapData(Generator<Pair<K,V>> gen, int quantity) {
        for(int i = 0; i < quantity; i++){
            Pair<K,V> p = gen.next();
            put(p.key,p.value);
        }
    }

    public MapData(Generator<K> genK, Generator<V> genV, int quantity){
        for(int i = 0; i < quantity; i ++){
            put(genK.next(), genV.next());
        }
    }

    public MapData(Generator<K> genK, V value, int quantity){
        for(int i = 0; i < quantity; i++){
            put(genK.next(), value);
        }
    }

    public MapData(Iterable<K> genK, Generator<V> genv){
        for(K key: genK){
            put(key, genv.next());
        }
    }

    public MapData(Iterable<K> genK, V value){
        for(K key : genK){
            put(key, value);
        }
    }

    public static <K,V> MapData<K,V> map(Generator<Pair<K,V>> gen, int quantity){
        return new MapData<K,V>(gen, quantity);
    }

    public static <K,V> MapData<K,V> map(Generator<K> genK, Generator<V> genV, int quantity){
        return new MapData<K,V>(genK, genV, quantity);
    }

    public static <K,V> MapData<K,V> map(Generator<K> genK, V value, int quantity){
        return new MapData<K,V>(genK, value, quantity);
    }

    public static <K,V> MapData<K,V> map(Iterable<K> genK, Generator<V> genv){
        return new MapData<K,V>(genK, genv);
    }

    public static <K,V> MapData<K,V> map(Iterable<K> genK, V value){
        return new MapData<K,V>(genK, value);
    }
}

