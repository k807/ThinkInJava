package annotations;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-25 20:45
 * =============================================
 */
@ExtractInterface("IMultiplier")
public class Multiplier {
    public int multipy(int x, int y){
        int total = 0;
        for(int i = 0; i < x; i++){
            total = add(total, y);
        }
        return total;
    }
    private int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        Multiplier m = new Multiplier();
        System.out.println("11*16= " + m.multipy(11,16));
    }
}
