import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = new int[]{10, 14, 13, 21, 56, 32, 1, 5, 6, 7, 4, 3, 2, 1};
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = divideArray(array, from, to); // выбираем опорный элемент

            quickSort(array, from, pivot - 1);
            quickSort(array, pivot, to);
        }
    }

    public static int divideArray(int[] array, int from, int to) {
        int rIndex = to;
        int lIndex = from;

        int pivot = array[from + (to - from) / 2];
        while (lIndex <= rIndex) {
            while (array[lIndex] < pivot)
                lIndex++;

            while (array[rIndex] > pivot)
                rIndex--;

            if (lIndex <= rIndex) {
                swap(array, lIndex, rIndex);
                lIndex++;
                rIndex--;
            }
        }
        return lIndex;
    }

    public static void swap(int[] array, int left, int right) {
        int tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }
}
