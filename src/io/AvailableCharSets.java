package io;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-23 14:16
 * =============================================
 */
public class AvailableCharSets {
    public static void main(String[] args) {
        SortedMap<String,Charset> charSets = Charset.availableCharsets();
        Iterator<String> it = charSets.keySet().iterator();
        while (it.hasNext()){
            String csName = it.next();
            System.out.print(csName);
            Iterator aliases = charSets.get(csName).aliases().iterator();
            if(aliases.hasNext()){
                System.out.print(": ");
            }
            while(aliases.hasNext()){
                System.out.print(aliases.next());
                if(aliases.hasNext()){
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
