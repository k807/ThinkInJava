package enumerated;

import java.util.EnumSet;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 14:18
 * =============================================
 */
import static enumerated.AlarmPoints.*;
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
        System.out.println(points);
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
