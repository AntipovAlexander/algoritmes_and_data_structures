package algoritmes.sort;

import utils.ArrayUtils;

public class ShellSort {
    public static void sort(int[] a) {
        int n = a.length; // array size
        int h = 1; // step

        // determining step
        while (h < n/3) {
            h = 3*h + 1;
        }

        // sorting loop
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >=h && a[j] < a[j-h]; j -= h) {
                    ArrayUtils.swap(a, j, j - h);
                }
            }

            // decreasing step
            h = h/3;
        }

    }
}
