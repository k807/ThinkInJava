package generics;

/**
 * =============================================
 *
 * @author wu
 * @create 2018-06-15 11:08
 * =============================================
 */
class Generic<T>{};
public class ArrayOfGenericReference {
    //可以定义一个泛型化数组
    //但是，永远都不能创建这个确切类型的数组
    static Generic<Integer>[] gia;
}
