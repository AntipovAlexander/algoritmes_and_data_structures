package utils;

import java.util.Random;

/**
 * class with static method for array working
 */
public class ArrayUtils {

    /**
     * check is passed array sorted from low to high
     * @param a array for check
     * @return sorted or not
     */
    public static boolean isSorted(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]) return false;
        }
        return true;
    }

    /**
     * @param a array in which will be exchanging
     * @param i index of exchange
     * @param min index of exchange
     */
    public static void swap(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public static void shuffleRandomly(int a[]) {
        Random r = new Random();

        for (int i = a.length-1; i > 0; i--) {

            // Pick a random index from 0 to i
            int j = r.nextInt(i);

            // swap with random item
            swap(a, i, j);
        }
    }
}
