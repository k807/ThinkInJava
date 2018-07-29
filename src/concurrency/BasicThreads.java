package concurrency;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-25 21:41
 * =============================================
 */
public class BasicThreads {
    public static void main(String[] args) {
        for(int i =0; i < 5; i++){
            new Thread(new LiftOff()).start();
        }
        System.out.println("Waiting for LiftOff");
    }
}
