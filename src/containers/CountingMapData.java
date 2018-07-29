package containers;

import java.util.*;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 12:17
 * =============================================
 */
public class CountingMapData extends AbstractMap<Integer,String> {
    private int size;
    private static final String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");

    public CountingMapData(int size) {
        entries = new EntrySet(size);
        this.size = size < 0 ? 0 : size;
    }
    private static class Entry implements Map.Entry<Integer,String>{
        int index;

        public Entry(int index) {
            this.index = index;
        }

        @Override
        public boolean equals(Object obj) {
            return Integer.valueOf(index).equals(obj);
        }

        @Override
        public int hashCode() {
            return Integer.valueOf(index).hashCode();
        }


        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            return chars[index % chars.length] + Integer.toString(index / chars.length);
        }

        @Override
        public String setValue(String value) {
            return null;
        }
    }

    private static class EntrySet extends AbstractSet<Map.Entry<Integer,String>>{

        private int size;
        Iter iter = null;

        public EntrySet(int size) {
            this.size = size;
        }

        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return iter == null?new Iter():iter;
        }

        @Override
        public int size() {
            return size;
        }

        private class Iter implements Iterator<Map.Entry<Integer, String>> {
            private Entry entry = new Entry(-1);

            @Override
            public boolean hasNext() {
                return entry.index < size - 1;
            }

            @Override
            public Map.Entry<Integer, String> next() {
                entry.index++;
                return entry;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }
    }

    Set<Map.Entry<Integer,String>> entries;

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        return entries;
    }

    public static void main(String[] args) {
        System.out.println(new CountingMapData(60));
    }
}
