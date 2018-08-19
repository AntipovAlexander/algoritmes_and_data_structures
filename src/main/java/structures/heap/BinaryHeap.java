package structures.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class BinaryHeap<T> implements IBinaryHeap {

    private ArrayList<Comparable> heap;

    public BinaryHeap() {
        this.heap = new ArrayList<>();
    }

    @Override
    public void add(Comparable item) {
        heap.add(item);
        swim(heap.size()-1);
    }

    @Override
    public Comparable deleteMax() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        Comparable max = heap.get(0);
        Collections.swap(heap, 0, heap.size()-1);
        heap.remove(heap.size()-1);
        sink(0);
        return max;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean less(int i, int j) {
        return heap.get(i).compareTo(heap.get(j)) < 0;
    }

    @Override
    public void swim(int k) {
        while (k > 0 && less((k-1)/2, k)) {
            Collections.swap(heap, (k-1)/2, k);
            k = (k-1)/2;
        }
    }

    @Override
    public void sink(int k) {
        int heapSize = heap.size()-1;
        while (2*k <= heapSize) {
            int j = 2*k;
            if (j < heapSize && less(j, j+1)) {
                j++;
            }

            if (!less(k, j)) {
                break;
            }

            Collections.swap(heap, k, j);

            k = j;
        }
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}
