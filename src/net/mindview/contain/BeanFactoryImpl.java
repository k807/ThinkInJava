package net.mindview.contain;

import net.mindview.handler.BeanHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-19 20:44
 * =============================================
 */
public class BeanFactoryImpl implements BeanFactory ,HandlerFactory{
    private BeanFactoryImpl(){}



    private static class Singleton{
        static {
            beanFactory = new BeanFactoryImpl();
        }
        private static BeanFactoryImpl beanFactory;
    }

    public static <T> T getInstance() {
        return (T) Singleton.beanFactory;
    }

    private Map<String,Object> registry = new ConcurrentHashMap<String,Object>();
    private Map<String,InvocationHandler> handlermap = new ConcurrentHashMap<String,InvocationHandler>();


    @Override
    public boolean registHandle(String name, InvocationHandler handle) {
        handlermap.put(name,handle);
        return true;
    }

    @Override
    public boolean regist(String beanName, Object obj) {
        Object reg = obj;
        for(Class c : obj.getClass().getInterfaces()){
            if(c.getSimpleName().equals("FileTask")){
                InvocationHandler handler = handlermap.get("FileTask");
                if(handler instanceof BeanHandler){
                    ((BeanHandler) handler).setProxied(obj);
                }
                reg = Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
            }
        };

        if(registry.containsKey(beanName)){
            return false;
        }else{
            registry.put(beanName,reg);
            return true;
        }
    }

    @Override
    public Object getBean(String beanName) {
        return registry.get(beanName);
    }
}
