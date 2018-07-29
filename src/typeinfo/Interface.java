package typeinfo;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 18:15
 * =============================================
 */
public interface Interface {
    void domSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{

    @Override
    public void domSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface{

    @Override
    public void domSomething() {

    }

    @Override
    public void somethingElse(String arg) {

    }
}
