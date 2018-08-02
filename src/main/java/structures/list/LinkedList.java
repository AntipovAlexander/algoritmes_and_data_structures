package structures.list;

import java.util.Iterator;

public class LinkedList<T> implements ILinkedList<T> {

    private Node tail;         // the very first element of list (start)
    private Node head;         // the very last element of list (end)
    private int count;         // item counter
    private Node current;      // current item for iterator

    private class Node {
        T item;
        Node next;
        Node previous;
    }

    @Override
    public void addToEnd(T item) {
        // creating new node
        Node node = new Node();
        node.item = item;

        // if list was empty
        if (isEmpty()) {
            // set it as first and last item
            tail = node;
            head = tail;
            current = tail;
        } else {
            // next to current head is new node
            head.next = node;
            // previous to new node is current head
            node.previous = head;
            // new node is head now
            head = node;
        }

        // updating counter;
        count++;
    }

    @Override
    public void addToStart(T item) {
        // creating new node
        Node node = new Node();
        node.item = item;

        // if list was empty
        if (isEmpty()) {
            // set it as first and last item
            tail = node;
            head = tail;
        } else {
            // next to new node is tail
            node.next = tail;
            // previous to old tail is new node
            tail.previous = node;
            // new node is tail now
            tail = node;
        }


        // updating counter;
        count++;
    }

    @Override
    public void removeLast() throws UnsupportedOperationException {
        if (isEmpty()) throw new UnsupportedOperationException("Empty list.");

        if (count > 1){
            head = head.previous;
            head.next = null;
        } else {
            // if it last element (it means that is tail and head) -
            // - setup tail and head to null

            tail = null;
            head = null;
        }
        --count;
    }

    @Override
    public void removeFirst() throws UnsupportedOperationException {
        if (isEmpty()) throw new UnsupportedOperationException("Empty list.");

        tail = tail.next;
        --count;
    }

    @Override
    public void removeAt(int i) throws ArrayIndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not implemented yet.");
//        // if we haven't such index - throw exception
//        if (i > count || i < 0) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//            Iterator iterator = iterator();
//            Node removable = tail;
//            // finding element to remove
//            for (int j = 0; j < i; j++) {
//                removable = removable.next;
//            }
//            removable.next = removable.next.next;
//        }
    }

    @Override
    public void insertBefore(int i) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public void insertAfter(int i) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public T getFirst() throws UnsupportedOperationException {
        if (isEmpty()) throw new UnsupportedOperationException("Empty list.");

        return tail.item;
    }

    @Override
    public T getLast() throws UnsupportedOperationException {
        if (isEmpty()) throw new UnsupportedOperationException("Empty list.");

        return head.item;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public Iterator iterator() {
        // first element is current always when requesting iterator
        current = tail;
        return this;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.item;
        current = current.next;
        return value;
    }
}
