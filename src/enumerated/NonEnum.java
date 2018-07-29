package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:36
 * =============================================
 */
public class NonEnum {
    public static void main(String[] args) {
        Class<Integer> intClass = Integer.class;
        for(Object en : intClass.getEnumConstants()){
            System.out.println(en);
        }
    }
}
