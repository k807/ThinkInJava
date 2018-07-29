package containers;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 15:13
 * =============================================
 */
public class Groundhog {
    protected int number;

    public Groundhog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Groundhog #" + number;
    }
}

