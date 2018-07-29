package generics;

import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 17:13
 * =============================================
 */
public class GerericTestSuperAndExtends {
    <T extends Fruit> T get(T t){
        return t;
    }

    void get(List<? super Fruit> list){
        list.add(new Fruit());
//        list.add(new Object());
        list.add(new Jonathan());
    }

    Fruit get(List<? extends Fruit> list ,int index){
        return list.get(index);
    }

    public static void main(String[] args) {

    }
}
