package enumerated;

import net.mindview.util.Enums;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:48
 * =============================================
 */

enum Activity{
    SITTING,LYING,STANDING,HOPPING,RUNNING,DODGING,JUMPING,FALLING,FLYING
}
public class RandomTest {
    public static void main(String[] args) {
        for(int i = 0; i < 20; i++){
            System.out.println(Enums.random(Activity.class) + " ");
        }
    }
}
