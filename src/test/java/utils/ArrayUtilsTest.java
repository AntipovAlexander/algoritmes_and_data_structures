package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayUtilsTest {

    @Test
    void isSortedPositive() {
        int[] a = {1, 2, 3, 5, 10, 22, 500};

        assertTrue(ArrayUtils.isSorted(a));
    }

    @Test
    void isSortedNegative() {
        int[] a = {1, 2, 3, 0, 10, 22, 500};

        assertFalse(ArrayUtils.isSorted(a));
    }

    @Test
    void shuffleTest() {
        int[] a = {1, 2, 3, 0, 10, 22, 500};
        int[] b = a.clone();

        ArrayUtils.shuffleRandomly(a);

        for (int i = 0; i < a.length-1; i++ ) {
            assert a[i] != b[i];
        }
    }
}