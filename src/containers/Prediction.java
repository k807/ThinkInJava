package containers;

import java.util.Random;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 15:14
 * =============================================
 */
public class Prediction {
    private static Random rand = new Random(47);
    private boolean shadow = rand.nextDouble() > 0.5;

    @Override
    public String toString() {
        if(shadow){
            return "Six more weeks of Winter!";
        }else{
            return "Early Spring!";
        }
    }
}
