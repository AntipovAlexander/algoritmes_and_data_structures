package structures.heap;

public interface IBinaryHeap<T extends Comparable> {
    void add(T item);

    T deleteMax();

    boolean less(int i, int j);

    void swim(int k);

    void sink(int k);

    int size();

    boolean isEmpty();
}
