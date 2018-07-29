package net.mindview.contain;

public interface BeanFactory {

    boolean regist(String beanName, Object obj);

    Object getBean(String beanName);
}
