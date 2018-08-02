package structures.queue;

import structures.list.ILinkedList;
import structures.list.LinkedList;

public class Queue<T> implements IQueue<T> {

    private ILinkedList<T> data;

    public Queue() {
        data = new LinkedList<>();
    }

    @Override
    public void enqueue(T item) {
        data.addToEnd(item);
    }

    @Override
    public T dequeue() throws UnsupportedOperationException{
        if (isEmpty()) throw new UnsupportedOperationException("Empty queue");
        T item = data.getFirst();
        data.removeFirst();
        return item;
    }

    @Override
    public T peek() throws UnsupportedOperationException{
        if (isEmpty()) throw new UnsupportedOperationException("Empty queue");
        return data.getFirst();
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
