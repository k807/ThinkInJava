package net.mindview.contain;

import java.lang.reflect.InvocationHandler;

interface HandlerFactory {
    boolean registHandle(String name, InvocationHandler handle);
}
