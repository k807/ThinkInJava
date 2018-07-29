package search;

public interface Searcher<T extends Comparable<T>> {
    int search(T[] arr,T target);
}
