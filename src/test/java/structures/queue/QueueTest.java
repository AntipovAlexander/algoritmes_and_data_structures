package structures.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    IQueue<Integer> queue;
    Integer[] testData;

    @BeforeEach
    public void setUp() {
        queue = new Queue<>();
        testData = new Integer[] {1,2,3,4,5,6,7,8,9,10};
    }

    @Test
    public void enqueueDequeue() {
        for (Integer integer : testData) {
            queue.enqueue(integer);
        }

        // assert length
        assert queue.count() == testData.length;

        // asserting that enqueued values dequeing in the correct order
        for (int i = 0; i  < testData.length; i++) {
            assert queue.dequeue().equals(testData[i]);
        }

        // assert length
        assert queue.count() == 0;
    }

    @Test
    public void peek() {
        for (Integer integer : testData) {
            queue.enqueue(integer);
        }

        int countBeforePeeking = queue.count();

        // make some peeks
        for (int i = 0; i < 5; i++) {
            queue.peek();
        }

        // assert length
        assert queue.count() == countBeforePeeking;
    }

    @Test
    public void count() {
        // initial size is always zero
        assert queue.count() == 0;

        queue.enqueue(1);

        assert queue.count() == 1;

        queue.dequeue();

        assert queue.count() == 0;
    }

    @Test
    public void peekFromEmpty(){
        assertThrows(UnsupportedOperationException.class, () -> queue.peek());
    }

    @Test
    public void dequeueFromEmpty(){
        assertThrows(UnsupportedOperationException.class, () -> queue.dequeue());
    }

    @Test
    public void isEmpty() {
        assertTrue(queue.isEmpty());

        queue.enqueue(1);

        assertFalse(queue.isEmpty());
    }
}