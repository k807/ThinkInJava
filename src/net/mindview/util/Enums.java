package net.mindview.util;

import javax.swing.plaf.ProgressBarUI;
import java.util.Random;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:44
 * =============================================
 */
public class Enums {
    private static Random rand = new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }

    public static <T> T random(T[] values){
        return values[rand.nextInt(values.length)];
    }
}
