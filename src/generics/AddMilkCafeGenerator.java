package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:22
 * =============================================
 */
public class AddMilkCafeGenerator implements CafeGenerator{

    private CafeGenerator parent;

    public AddMilkCafeGenerator(CafeGenerator parent) {
        this.parent = parent;
    }

    @Override
    public void process(Cafe cafe) {
        System.out.println("我导入了牛奶");
        parent.process(cafe);
    }
}
