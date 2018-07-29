package containers;

import java.util.LinkedHashMap;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 15:03
 * =============================================
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedMap = new LinkedHashMap<Integer,String>(new CountingMapData(9));
        System.out.println(linkedMap);
        linkedMap = new LinkedHashMap<Integer,String>(16,075f,true);
        linkedMap.putAll(new CountingMapData(9));
        System.out.println(linkedMap);
        for(int i = 0; i < 6; i++){
            linkedMap.get(i);
        }
        System.out.println(linkedMap);
        linkedMap.get(0);
        System.out.println(linkedMap);
    }
}
