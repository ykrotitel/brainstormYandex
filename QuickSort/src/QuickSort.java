import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
//        int[] a = new int[]{10, 14, 13, 21, 56, 32, 1, 5, 6, 7, 4, 3, 2, 1};
        int[] a = new int[]{2, 4, 3, 1};
        quickSort(a, 0, a.length - 1);

        System.out.println("this");
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = divideArray(array, from, to); // выбираем опорный элемент

            quickSort(array, from, pivot - 1);
            quickSort(array, pivot, to);
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
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



    //////////////////////
//    public static void quickSort(int[] arr, int from, int to) {
//
//        if (from < to) {
//
//            int divideIndex = partition(arr, from, to);
//
//            quickSort(arr, from, divideIndex - 1);
//
//            quickSort(arr, divideIndex, to);
//        }
//    }
//
//    private static int partition(int[] arr, int from, int to) {
//        int rightIndex = to;
//        int leftIndex = from;
//
//        int pivot = arr[from + (to - from) / 2];
//        while (leftIndex <= rightIndex) {
//
//            while (arr[leftIndex] < pivot) {
//                leftIndex++;
//            }
//
//            while (arr[rightIndex] > pivot) {
//                rightIndex--;
//            }
//
//            if (leftIndex <= rightIndex) {
//                swap(arr, rightIndex, leftIndex);
//                leftIndex++;
//                rightIndex--;
//            }
//        }
//        return leftIndex;
//    }
//
//    private static void swap(int[] array, int index1, int index2) {
//        int tmp  = array[index1];
//        array[index1] = array[index2];
//        array[index2] = tmp;
//    }
    //////////////////////

}