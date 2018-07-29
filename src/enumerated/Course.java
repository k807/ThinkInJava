package enumerated;

import net.mindview.util.Enums;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:57
 * =============================================
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),MAINCOURES(Food.MainCourse.class),DESSERT(Food.Dessert.class),COFFEE(Food.COFFEE.class);
    private Food[] values;
    private Course(Class<? extends Food> kind){
        values = kind.getEnumConstants();
    }
    public Food randomSelection(){
        return Enums.random(values);
    }
}
