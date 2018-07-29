package enumerated;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 16:02
 * =============================================
 */
public enum  OverrideConstantSpecific {
    NUT,BOLT,WASHER{
        @Override
        void f(){
            System.out.println("Overridden method");
        }
    };
    void f(){
        System.out.println("Overridden method");
    }

    public static void main(String[] args) {
        for(OverrideConstantSpecific ocs : values()){
            System.out.println(ocs + ": ");
            ocs.f();
        }
    }
}
