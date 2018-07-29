package generics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 11:33
 * =============================================
 */
interface TimeStamped{Long getStamp();}
interface SerialNumberd{Long getSerialNumber();}
interface Basic{
    public void Set(String val);
    public String get();
}
class BasicImpl implements Basic{
    private String val;
    @Override
    public void Set(String val) {
        this.val =val;
    }

    @Override
    public String get() {
        return val;
    }
}

class SerialNumberdImpl implements SerialNumberd{

    @Override
    public Long getSerialNumber() {
        return 2L;
    }
}

class TimeStampedImpl implements TimeStamped{

    @Override
    public Long getStamp() {
        return 2L;
    }
}
class TwoTuple<A,B>{
    final A first;
    final B second;

    TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }
}
class MixinProxy implements InvocationHandler{
    Map<String,Object> delegatesByMethod;

    public MixinProxy(TwoTuple<Object,Class<?>>... pairs) {
        delegatesByMethod = new HashMap<String,Object>();
        for(TwoTuple<Object,Class<?>> pair : pairs){
            for(Method method : pair.second.getMethods()){
                String methodName = method.getName();
                if(!delegatesByMethod.containsKey(methodName)){
                    delegatesByMethod.put(methodName,pair.first);
                }
            }
        }
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        Object delegate =delegatesByMethod.get(methodName);
        return method.invoke(delegate,args);
    }

    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces = new Class[pairs.length];
        for(int i = 0; i < pairs.length ; i++){
            interfaces[i] = (Class) pairs[i].second;
        }
        ClassLoader cl = pairs[0].first.getClass().getClassLoader();
        return Proxy.newProxyInstance(cl,interfaces,new MixinProxy(pairs));
    }
}

public class DynamicProxyMixin {
    public static void main(String[] args) {
        Object mixin = MixinProxy.newInstance();
    }
}
