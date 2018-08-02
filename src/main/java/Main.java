import algoritmes.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] i = { 11, 2, 35, 42, 15, 0, 5, 7, 1 };
        SelectionSort.sort(i);
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }

}
