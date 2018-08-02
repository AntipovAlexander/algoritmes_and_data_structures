package structures.stack;

import structures.list.ILinkedList;
import structures.list.LinkedList;

public class Stack <T> implements IStack<T> {

    private ILinkedList<T> data;

    public Stack() {
        data = new LinkedList<>();
    }

    @Override
    public T pop() throws UnsupportedOperationException {
        if (data.isEmpty())
            throw new UnsupportedOperationException("Empty stack");

        T item = data.getLast();
        data.removeLast();
        return item;
    }

    @Override
    public T peek() throws UnsupportedOperationException {
        if (data.isEmpty())
            throw new UnsupportedOperationException("Empty stack");

        return data.getLast();
    }

    @Override
    public void push(T item) {
        data.addToEnd(item);
    }

    @Override
    public int count() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return count() == 0;
    }
}
