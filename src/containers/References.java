package containers;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-18 17:52
 * =============================================
 */
class VeryBig{
    private static final int SIZE = 10000;
    private long[] la = new long[SIZE];
    private String ident;

    public VeryBig(String ident) {
        this.ident = ident;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize(){
        System.out.println("Finalizing " + ident);
    }
}
public class References {
    private static ReferenceQueue<VeryBig> rq =  new ReferenceQueue<VeryBig>();
    public static void checkQueue(){
        Reference<? extends VeryBig> inq = rq.poll();
        if(inq != null){
            System.out.println("In queue: " + inq.get());
        }
    }
    public static void main(String[] args){
        int size = 10;
        if(args.length > 0){
            size = new Integer(args[0]);
        }
    }
}
