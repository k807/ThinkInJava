package containers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 15:16
 * =============================================
 */
public class SpringDetector {
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception{
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<Groundhog,Prediction> map = new HashMap<Groundhog,Prediction>();
        for(int i = 0; i < 10; i ++){
            map.put(ghog.newInstance(i),new Prediction());
        }
        System.out.print("map = " + map);
        Groundhog gh = ghog.newInstance(3);
        System.out.print("Looking up prediction for " + gh);
        if(map.containsKey(gh)){
            System.out.print(map.get(gh));
        }else {
            System.out.print("Key not found: " + gh);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }
}
