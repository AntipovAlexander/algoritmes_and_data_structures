package structures.stack;

public interface IStack<T> {

    /**
     * @return top of the stack
     */
    T pop();

    /**
     * @return top of the stack without deleting
     */
    T peek();


    /**
     * @param item - to be inserted
     */
    void push(T item);

    /**
     * @return count of the stack items
     */
    int count();

    /**
     * @return empty stack or not
     */
    boolean isEmpty();
}
