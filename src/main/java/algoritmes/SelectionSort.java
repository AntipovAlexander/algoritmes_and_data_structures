package algoritmes;

/**
 * class with implementing of selection sort
 * see <a href="https://en.wikipedia.org/wiki/Selection_sort">Wiki page.</a>
 */
public class SelectionSort {

    /**
     * @param a - array to sort
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    /**
     * @param a array in which will be exchanging
     * @param i index of exchange
     * @param min index of exchange
     */
    private static void exchange(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}
