package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:25
 * =============================================
 */
public class AddChocolateCafeGenerator implements CafeGenerator{
    private CafeGenerator parent;

    public AddChocolateCafeGenerator(CafeGenerator parent) {
        this.parent = parent;
    }

    @Override
    public void process(Cafe cafe) {
        System.out.println("我加入了巧克力");
        parent.process(cafe);
    }
}
