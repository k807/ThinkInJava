package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:28
 * =============================================
 */
public class CafeGeneratorFactory {

    public static CafeGenerator create(String arg){
        return new AddBubbleCafeGenerator(new AddChocolateCafeGenerator(new AddMilkCafeGenerator(new BasicCafeGenerator())));
    }

    public static void main(String[] args) {
        CafeGenerator cafeGenerator = create("");
        cafeGenerator.process(new Cappuccino());
    }
}
