package algoritmes.sort;

import utils.ArrayUtils;

/**
 * class with implementing of insertion sort
 * see <a href="https://en.wikipedia.org/wiki/Insertion_sort">Wiki page.</a>
 */
public class InsertionSort {
    /**
     * @param a - array to sort
     */
    public static void sort(int[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
                ArrayUtils.swap(a, j, j-1);
            }
        }
    }
}
