package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 18:32
 * =============================================
 */
public class TransactionHandler implements InvocationHandler {
    Object proxy;

    public TransactionHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
