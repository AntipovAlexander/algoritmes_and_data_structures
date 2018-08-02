package structures.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    Stack<Integer> stack;
    Integer[] testData;

    @BeforeEach
    public void setUp() {
        stack = new Stack<>();
        testData = new Integer[] {1,2,3,4,5,6,7,8,9,10};
    }

    @Test
    public void popPush() {
        for (Integer integer : testData) {
            stack.push(integer);
        }

        // asserting stack size
        assert stack.count() == testData.length;

        // pop out all elements and assert
        for (int i = testData.length; i > 0; i--) {
             assert stack.pop().equals(testData[i-1]);
        }

        // assert stack is empty
        assert stack.count() == 0;
    }

    @Test
    public void peek() {
        for (Integer integer : testData) {
            stack.push(integer);
        }

        int countBeforePeeking = stack.count();

        // make some peeks
        for (int i = 0; i < 5; i++) {
            stack.peek();
        }

        // assert stack count is not changed
        assert stack.count() == countBeforePeeking;
    }


    @Test
    public void count() {
        // initial size is always zero
        assert stack.count() == 0;

        stack.push(1);

        assert stack.count() == 1;

        stack.pop();

        assert stack.count() == 0;
    }

    @Test
    public void peekFromEmpty() {
        assertThrows(UnsupportedOperationException.class, () -> stack.peek());
    }

    @Test
    public void popFromEmpty() {
        assertThrows(UnsupportedOperationException.class, () -> stack.pop());
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(1);

        assertFalse(stack.isEmpty());
    }
}