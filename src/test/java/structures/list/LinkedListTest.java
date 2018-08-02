package structures.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {

    ILinkedList<Integer> list;
    Integer[] testData;

    @BeforeEach
    public void init() {
        list = new LinkedList<>();
        testData = new Integer[] {1,2,3,4,5,6,7,8,9,10};
    }

    @Test
    public void addToEnd() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        // asserting that all elements is added to list
        assert list.size() == testData.length;

        Iterator iterator = list.iterator();
        int i = 0;
        // assert each element of array
        while (iterator.hasNext()){
            assert iterator.next().equals(testData[i]);
            i++;
        }
    }

    @Test
    public void addToStart() {
        for (Integer integer : testData) {
            list.addToStart(integer);
        }

        // asserting that all elements is added to list
        assert list.size() == testData.length;

        Iterator iterator = list.iterator();
        int i = testData.length-1;
        // assert each element of array
        while (iterator.hasNext()){
            assert iterator.next().equals(testData[i]);
            i--;
        }
    }

    @Test
    public void removeLast() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        // removing two last items
        list.removeLast();
        list.removeLast();

        // assert list size
        assert list.size() == testData.length - 2;

        Iterator iterator = list.iterator();
        int i = 0;
        // assert each element of array
        while (iterator.hasNext()){
            assert iterator.next().equals(testData[i]);
            i++;
        }
    }

    @Test
    public void removeFirst() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        // removing two first items
        list.removeFirst();
        list.removeFirst();

        // assert list size
        assert list.size() == testData.length - 2;

        Iterator iterator = list.iterator();
        int i = 2;
        // assert each element of array
        while (iterator.hasNext()){
            assert iterator.next().equals(testData[i]);
            i++;
        }
    }

    @Test
    public void getFirst() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        assert list.getFirst().equals(testData[0]);
    }

    @Test
    public void getLast() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        assert list.getLast().equals(testData[testData.length - 1]);
    }

    @Test
    public void testRemoveAt() {
        assertThrows(UnsupportedOperationException.class, () -> list.removeAt(1));
    }

    @Test
    public void testInsertBefore() {
        assertThrows(UnsupportedOperationException.class, () -> list.insertBefore(1));
    }

    @Test
    public void testInsertAfter() {
        assertThrows(UnsupportedOperationException.class, () -> list.insertAfter(1));
    }

    @Test
    public void testRemoveFirstFromEmptyList(){
        assertThrows(UnsupportedOperationException.class, () -> list.removeFirst());
    }

    @Test
    public void testRemoveLastFromEmptyList(){
        assertThrows(UnsupportedOperationException.class, () -> list.removeLast());
    }

    @Test
    public void testGetFirstFromEmptyList(){
        assertThrows(UnsupportedOperationException.class, () -> list.getFirst());
    }

    @Test
    public void testGetLastFromEmptyList(){
        assertThrows(UnsupportedOperationException.class, () -> list.getLast());
    }

    @Test
    public void size() {
        // assert that new list size is zero
        assert list.size() == 0;

        list.addToEnd(1);

        // assert that after updating list size updates too
        assert list.size() == 1;

        list.removeFirst();

        // assert that after updating list size updates too
        assert list.size() == 0;
    }

    @Test
    public void isEmpty() {
        // assert that new list is empty
        assert list.isEmpty();

        list.addToEnd(1);

        // assert that list is  not empty
        assert !list.isEmpty();
    }

    @Test
    public void iterator() {
        // assert that iterator isnt null
        assert list.iterator() != null;
    }

    @Test
    public void hasNext() {
        // asserting that new list haven't next item
        Iterator iterator = list.iterator();
        assert !iterator.hasNext();

        list.addToEnd(1);

        assert iterator.hasNext();
    }

    @Test
    public void next() {
        for (Integer integer : testData) {
            list.addToEnd(integer);
        }

        Iterator i = list.iterator();
        int j = 0;
        while (i.hasNext()) {
            // asserting each list item
            assert i.next().equals(testData[j]);
            j++;
        }
    }
}