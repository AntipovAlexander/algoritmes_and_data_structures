import algoritmes.sort.QuickSort;
import algoritmes.sort.ShellSort;
import structures.heap.BinaryHeap;
import utils.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        int[] i = { 11, 2, 35, 42, 15, 0, 5, 7, 1 };
//        ShellSort.sort(i);
//        for (int j = 0; j < i.length; j++) {
//            System.out.println(i[j]);
//        }
//        System.out.println(ArrayUtils.isSorted(i));

        BinaryHeap<Integer> heap = new BinaryHeap<>();

        heap.add(16);
        heap.add(14);
        heap.add(9);
        heap.add(10);
        heap.add(1);
        heap.add(500);
        heap.add(8);
        heap.add(2);
        heap.add(7);
        heap.add(3);
        heap.add(4);
        heap.add(100);

        heap.deleteMax();
        heap.deleteMax();

        heap.add(500);

        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();

        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();
        heap.deleteMax();

        heap.toString();
    }

}
