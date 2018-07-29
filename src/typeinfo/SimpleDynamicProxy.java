package typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 18:17
 * =============================================
 */
class DynamicProxyHandle implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandle(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if(args!=null){
            for(Object arg : args){
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied,args);
    }
}

class SimpleDynamicProxy{
    public static void consumer(Interface iface){
        iface.domSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) java.lang.reflect.Proxy.newProxyInstance(real.getClass().getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandle(real));
        consumer(proxy);
    }
}