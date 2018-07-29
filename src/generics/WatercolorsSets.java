package generics;

import net.mindview.util.Sets;

import java.util.EnumSet;
import java.util.Set;
import static generics.Watercolors.*;
/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-14 21:19
 * =============================================
 */
public class WatercolorsSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED,VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE,BURNT_UMBER);
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1,set2): " + Sets.union(set1,set2));
        System.out.println("intersection(set1,set2): " + Sets.intersection(set1,set2));
        System.out.println("difference(set1,set2): " + Sets.difference(set1,set2));
        System.out.println("complement(set1,set2): " + Sets.complement(set1,set2));
    }
}
