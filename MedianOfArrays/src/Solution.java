public class Solution {
    public static void main(String[] args) {
        int[] a = new int[2];
        int[] b = new int[2];

        a[0] = 2;
        a[1] = 4; //3

        b[0] = 1; //2
        b[1] = 3; //7


        double d = findMedian(a, b);
        System.out.println(d);
    }

    public static double findMedian(int[] nums1, int[] nums2) {
        int[] c = new int[nums1.length + nums2.length];

        int i = 0;
        while (i != nums1.length) {
            c[i] = nums1[i];
            i++;
        }
        int j = i;
        i = 0;
        while (i != nums2.length) {
            c[j] = nums2[i];
            i++;
            j++;
        }
        quickSort(c, 0, c.length - 1);

        double test = findMedian(c);
        int a = 5;
        a = a + 1;
         return findMedian(c);
    }

    public static void quickSort(int []c, int from, int to) {
        if (from < to) {
            int pivot = findPivot(c, from, to);

            quickSort(c, from, pivot - 1);
            quickSort(c, pivot, to);
        }
    }

    public static int findPivot(int[] array, int from, int to) {
        int rIndex = to;
        int lIndex = from;

        int pivot = array[from + (to - from) / 2];
        while(lIndex <= rIndex) {
            while(array[lIndex] < pivot)
                lIndex++;

            while(array[rIndex] > pivot)
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




    public static double findMedian(int[] a) {
        if (a.length % 2 == 1)
            return a[a.length / 2];
        return 0.5 * (a[a.length / 2 - 1] + a[a.length / 2]);
    }
}
