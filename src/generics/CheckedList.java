package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-16 10:50
 * =============================================
 */
class Cat{}
class Dog{}
public class CheckedList {
    static void oldStyleMethod(List probablyDogs){
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<Dog>();
        oldStyleMethod(dogs1);
        List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(),Dog.class);
        try {
            oldStyleMethod(dogs2);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}

