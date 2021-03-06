package algoritmes.sort;

import algoritmes.sort.InsertionSort;
import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void sort() {
        int[] i = { 11, 2, 35, 42, 15, 0, 5, 7, 1 };

        // asserting that array is not sorted at start
        assertFalse(ArrayUtils.isSorted(i));

        InsertionSort.sort(i);

        // asserting that array is sorted after InsertionSort.sort(i)
        assertTrue(ArrayUtils.isSorted(i));
    }
}