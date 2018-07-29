package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 21:07
 * =============================================
 */
public class ComparablePet implements Comparable<ComparablePet>{

    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

//class Cat extends ComparablePet implements Comparable<Cat>{
//
//}

class Hamster extends ComparablePet implements Comparable<ComparablePet>{

}