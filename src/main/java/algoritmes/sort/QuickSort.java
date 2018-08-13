package algoritmes.sort;

import utils.ArrayUtils;

/**
 * class with implementing of quick sort
 * see <a href="https://en.wikipedia.org/wiki/Quicksort">Wiki page.</a>
 */
public class QuickSort {

    /**
     * @param a - array to be sorted
     */
    public static void sort(int a[]) {
        // to avoid case when array already sorted.
        // when array already sorted, Quick Sort speed increases up to N^2
        ArrayUtils.shuffleRandomly(a);

        // start sorting
        sort(a, 0, a.length-1);
    }

    /**
     * private method for sorting
     *
     * @param a - array to be sorted
     * @param lo - first index
     * @param hi - last index
     */
    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;                       // array contain one element (already sorted)
        }

        int pivot = partition(a, lo, hi); // divide array by pivot element and sorting it

        // sort left part
        sort(a, lo, pivot-1);
        // sort right part
        sort(a, pivot+1, hi);
    }

    /**
     * private method for partition and sorting array by pivot
     *
     * @param a - array
     * @param lo - first index of a
     * @param hi - last index of a
     * @return index of pivot
     */
    private static int partition(int[] a, int lo, int hi) {
        int i = lo;                       // pointer from start
        int j = hi+1;                     // pointer from end
        int pivot = a[lo];                // pivot

        while (true) {
            while (a[++i] < pivot) {      // finding index of element that isn't less than pivot
                if (i == hi) break;
            }

            while (pivot < a[--j]) {      // finding index of element that isn't bigger than pivot
                if (j == lo) break;
            }

            if (i >= j) break;            // if pointers are equals - stop loop, array sorted regarding pivot

            ArrayUtils.swap(a, i, j);     // swap elements that placed in incorrect position (smaller or bigger than pivot)
        }

        ArrayUtils.swap(a, lo, j);        // swap pivot with right element

        return j;                         // returning pivot
    }
}
