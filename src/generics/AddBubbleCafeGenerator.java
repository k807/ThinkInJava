package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:24
 * =============================================
 */
public class AddBubbleCafeGenerator implements CafeGenerator{
    private CafeGenerator parent;

    public AddBubbleCafeGenerator(CafeGenerator parent) {
        this.parent = parent;
    }

    @Override
    public void process(Cafe cafe) {
        System.out.println("我加入了泡沫");
        parent.process(cafe);
    }
}
