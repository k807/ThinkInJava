package annotations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 23:08
 * =============================================
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> userCases, Class<?> cl){
        for(Method m : cl.getDeclaredMethods()){
            System.out.println(Arrays.toString(m.getAnnotations()));
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null){
                System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
                userCases.remove(new Integer(uc.id()));
            }
        }
        for(int i : userCases){
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases,47,48,49,50);
        trackUseCases(useCases,PasswordUtils.class);
    }
}
