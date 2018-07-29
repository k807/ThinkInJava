package concurrency;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-25 21:38
 * =============================================
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
