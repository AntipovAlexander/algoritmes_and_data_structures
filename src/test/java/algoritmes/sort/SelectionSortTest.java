package algoritmes.sort;

import algoritmes.sort.SelectionSort;
import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void sort() {
        int[] i = { 11, 2, 35, 42, 15, 0, 5, 7, 1 };

        // asserting that array is not sorted at start
        assertFalse(ArrayUtils.isSorted(i));

        SelectionSort.sort(i);

        // asserting that array is sorted after SelectionSort.sort(i)
        assertTrue(ArrayUtils.isSorted(i));
    }
}