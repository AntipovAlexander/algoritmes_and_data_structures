package structures.list;

import java.util.Iterator;

/**

 interface for parametrized (T) linked list

 */
public interface ILinkedList<T> extends Iterator<T> {

    /**
     * adds item to end of the list
     * @param item - item which will be inserted
     */
    void addToEnd(T item);

    /**
     * adds item to start of the list
     * @param item - item which will be inserted
     */
    void addToStart(T item);

    /**
     * remove last item from list
     */
    void removeLast();

    /**
     * remove first item from list
     */
    void removeFirst();

    /**
     * remove element at index
     * @param i - index of element which will be removed
     */
    void removeAt(int i);

    /**
     * insert element before index
     * @param i - index
     */
    void insertBefore(int i);

    /**
     * insert element after index
     * @param i - index
     */
    void insertAfter(int i);

    /**
     * @return first item of the list
     */
    T getFirst();

    /**
     * @return last item of the list
     */
    T getLast();

    /**
     * @return size of the list
     */
    int size();

    /**
     * @return empty list or not
     */
    boolean isEmpty();


    /**
     * @return iterator for current list
     */
    Iterator iterator();
}
