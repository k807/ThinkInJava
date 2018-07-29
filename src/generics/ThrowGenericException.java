package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 10:55
 * =============================================
 */
interface Processor<T,E extends Exception>{
    void process(List<T> resulCollector) throws E;
}

class ProcessRunner<T,E extends Exception> extends ArrayList<Processor<T,E>>{
    List<T> processAll() throws E{
        List<T> resultCollector = new ArrayList<T>();
        for(Processor<T,E> processor : this){
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}

class Failurel extends Exception{}

class Processor1 implements Processor<String,Failurel>{
    static int count = 3;
    @Override
    public void process(List<String> resulCollector) throws Failurel {
        if(count-- > 1){
            resulCollector.add("Hep!");
        }else{
            resulCollector.add("Ho!");
        }
        if(count < 0){
            throw new Failurel();
        }
    }
}

class Failure2 extends Exception{}

class Processor2 implements Processor<Integer,Failure2>{
    static int count = 2;

    @Override
    public void process(List<Integer> resulCollector) throws Failure2 {
        if(count -- == 0){
            resulCollector.add(47);
        }else{
            resulCollector.add(11);
        }
        if(count < 0){
            throw new Failure2();
        }
    }
}
public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String,Failurel> runner = new ProcessRunner<String,Failurel>();
        for(int i = 0; i < 3; i++){
            runner.add(new Processor1());
        }
        try {
            System.out.println(runner.processAll());
        }catch (Failurel e){
            System.out.println(e);
        }

        ProcessRunner<Integer,Failure2> runner2 = new ProcessRunner<Integer,Failure2>();
        for(int i = 0; i < 3; i++){
            runner2.add(new Processor2());
        }
        try {
            System.out.println(runner2.processAll());
        }catch (Failure2 e){
            System.out.println(e);
        }
    }
}
