package structures.queue;

public interface IQueue<T> {

    /**
     * @param item add item to queue
     */
    void enqueue(T item);

    /**
     * @return item from queue
     */
    T dequeue();

    /**
     * @return item from queue without removing
     */
    T peek();

    /**
     * @return count of items
     */
    int count();

    /**
     * @return empty queue or not
     */
    boolean isEmpty();
}
