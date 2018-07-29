package enumerated;

import net.mindview.util.Enums;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 14:05
 * =============================================
 */
public enum  SecurityCategory {
    STOCK(Security.Stock.class),BOND(Security.Bond.class);

    Security[] values;
    SecurityCategory(Class<? extends Security> kind){
        values = kind.getEnumConstants();
    }
    private interface Security{
        enum Stock implements Security{SHORT,LONG,MARGIN}
        enum Bond implements Security{MUNICIPAL,JUNK}
    }

    public Security randomSelection(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            SecurityCategory category = Enums.random(SecurityCategory.class);
            System.out.println(category + ": " + category.randomSelection());
        }
    }
}
