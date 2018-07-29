package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:55
 * =============================================
 */
public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Food.Appetizer.SALAD;
        food = Food.MainCourse.LASAGNE;
        food = Food.COFFEE.ESPRESSO;
        food = Food.COFFEE.CAPPUCCINO;
    }
}
