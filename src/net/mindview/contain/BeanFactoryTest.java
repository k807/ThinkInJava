package net.mindview.contain;

import net.mindview.handler.TransactionHandler;

import java.io.File;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-19 21:19
 * =============================================
 */
public class BeanFactoryTest {
    public static void main(String[] args) throws Exception {
        HandlerFactory handleFactory = BeanFactoryImpl.getInstance();
        BeanFactory beanFactory = BeanFactoryImpl.getInstance();
        handleFactory.registHandle("FileTask",new TransactionHandler());
        beanFactory.regist("SimpleTransaction",new SimpleTransaction());
        ((FileTask)beanFactory.getBean("SimpleTransaction")).process(new File("G:/a.txt"));
//        SimpleTransaction sts = new SimpleTransaction();
//        sts.process(new File("G:/a.txt"));
    }
}
