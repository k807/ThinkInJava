package net.mindview.handler;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-19 21:04
 * =============================================
 */
public class TransactionHandler implements BeanHandler {
    private Object proxied;


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Transaction begin");
        Object ret = null;
        if(method.getName().equals("process")){
            File copy = (File) args[0];
            String path = copy.getPath();
            int length = (int) copy.length();
            byte[] content = new byte[length];
            InputStream is = null;
            try {
                is = new FileInputStream(copy);
                is.read(content);
            }catch (Exception e){
                throw new RuntimeException(e);
            }finally {
                is.close();
            }

            try {
                method.invoke(proxied,args);
            }catch (Exception e){
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(copy);
                    fos.write(content);
                    fos.close();
                }catch (Exception e2){
                    throw new RuntimeException(e2);
                }finally {
                    fos.close();
                }
            }
        }
        System.out.println("Transaction end");
        return ret;
    }

    @Override
    public void setProxied(Object obj) {
        proxied = obj;
    }
}
