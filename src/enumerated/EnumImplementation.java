package enumerated;

import net.mindview.util.Generator;

import java.util.Random;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-24 13:40
 * =============================================
 */
enum CartoonCharacter{
    SLAPPY,SPANKY,PUNCHY,STLLY,BOUNCY,NUTTY,BOB;
    private static Random rand  = new Random(47);

    public static CartoonCharacter next(){
        return values()[rand.nextInt(values().length)];
    }
}
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg){
        System.out.println(rg.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;
        for(int i = 0; i < 10;i++){
            System.out.println(CartoonCharacter.next() + ", ");
        }
    }
}
