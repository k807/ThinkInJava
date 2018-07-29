package net.mindview.util;

import java.util.*;

/**
 * =============================================
 * 享元模式
 * @author wu
 * @create 2018-06-17 22:00
 * =============================================
 */
public class Countries {
    public static final String[][] DATA = {
            {"ALGERIA","Algiers"},
            {"ANGOLA","Luanda"},
            {"BURKINA FASO","Ouagadougou"}
    };
    private static class FLyweightMap extends AbstractMap<String,String> {
        private static class Entry implements Map.Entry<String,String>{
            int index;

            public Entry(int index) {
                this.index = index;
            }

            @Override
            public String getKey() {
                return DATA[index][0];
            }

            @Override
            public String getValue() {
                return DATA[index][1];
            }

            @Override
            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public int hashCode() {
                return DATA[index][0].hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return DATA[index][0].equals(obj);
            }
        }

        static class EntrySet extends AbstractSet<Map.Entry<String,String>>{
            private int size;

            public EntrySet(int size) {
                if(size < 0){
                    this.size = 0;
                }else if(size > DATA.length){
                    this.size = DATA.length;
                }else{
                    this.size = size;
                }
            }

            @Override
            public Iterator<Map.Entry<String, String>> iterator() {
                return new Iter();
            }

            @Override
            public int size() {
                return size;
            }

            private class Iter implements Iterator<Map.Entry<String,String>>{
                private Entry entry = new Entry(-1);
                @Override
                public boolean hasNext(){
                    return entry.index < size - 1;
                }

                @Override
                public Map.Entry<String, String> next() {
                    entry.index++;
                    return entry;
                }

                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            }
        }

        private static Set<Map.Entry<String,String>> entries = new EntrySet(DATA.length);
        @Override
        public Set<Map.Entry<String, String>> entrySet() {
            return entries;
        }
    }

    static Map<String,String> select(final int size){
        return new FLyweightMap(){
            @Override
            public Set<Map.Entry<String,String>> entrySet(){
                return new EntrySet(size);
            }
        };
    }

    static Map<String,String> map = new FLyweightMap();
    public static Map<String,String> capitals(){
        return map;
    }

    public static Map<String,String> capitals(int size){
        return select(size);
    }

    static List<String> names = new ArrayList<String>(map.keySet());
    public static List<String> names(int size){
        return new ArrayList<String>(select(size).keySet());
    }

    public static void main(String[] args) {
        System.out.println(capitals(10));
        System.out.println(names(10));
    }
}
