package net.mindview.util;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-17 21:32
 * =============================================
 */
public class Pair<K,V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
