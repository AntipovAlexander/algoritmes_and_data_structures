package algoritmes.sort;

import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void merge() {
        int[] a = { 11, 2, 35, 42, 15, 0, 5, 7, 1 };

        assertFalse(ArrayUtils.isSorted(a));

        MergeSort.sort(a);

         assertTrue(ArrayUtils.isSorted(a));
    }
}