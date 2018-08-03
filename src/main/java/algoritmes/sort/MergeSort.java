package algoritmes.sort;

public class MergeSort {
    private static int[] buf;

    public static void sort(int a[]) {
        buf = new int[a.length];

        MergeSort.sort(a, 0, a.length-1);
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;                  // array sorted, return
        }

        int mid = lo + (hi - lo)/2; // detecting middle of the array

        sort(a, lo, mid);           // sorting first part
        sort(a, mid+1, hi);     // sorting second part

        merge(a, lo, mid, hi);      // merging sorted parts
    }

    private static void merge(int[] a, int lo, int mid, int hi) {

        // copying array to buf
        for (int i = lo; i <= hi; i++) {
            buf[i] = a[i];
        }

        // indexes
        int j = lo;       // first part index
        int k = mid + 1;  // second part index

        // start merging
        for (int i = lo; i <= hi; i++) {

            if (j > mid) a[i] = buf[k++];              // if reached end of first part, merging all elements
                // from second part to source array

            else if (k > hi) a[i] = buf[j++];          // if reached end of the second part, merging all elements
                // from first part to source array

            else if (buf[k] < buf[j]) a[i] = buf[k++]; // if element from first part less than element from second part
                // merging j element to source array

            else a[i] = buf[j++];                      // else merging i element to source array
        }
    }
}
