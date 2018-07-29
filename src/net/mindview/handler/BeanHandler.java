package net.mindview.handler;

import java.lang.reflect.InvocationHandler;

public interface BeanHandler extends InvocationHandler {
    void setProxied(Object obj);
}
