package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-07-07 20:37
 * =============================================
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i = 0; i < 5; i ++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
