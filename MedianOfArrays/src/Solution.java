public class Solution {
    public static void main(String[] args) {
        int[] a = new int[0];
        int[] b = new int[5];

//        a[0] = 1;
//        a[1] = 3;
//        a[2] = 10;
//        a[3] = 11;

        b[0] = 5;
        b[1] = 6;
        b[2] = 7;
        b[3] = 8;
        b[4] = 20;

        double c = findMedianSortedArrays(a, b);
        System.out.println(c);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0)
            return 0;
        if (nums1.length == 0 && nums2.length != 0)
            return findMedian(nums2);
        else if (nums1.length != 0 && nums2.length == 0)
            return findMedian(nums1);
        double a = findMedian(nums1);
        double b = findMedian(nums2);
        return (a + b) / 2;
    }
    public static double findMedian(int[] a) {
        if (a.length % 2 == 1)
            return a[a.length / 2];
        return 0.5 * (a[a.length / 2 - 1] + a[a.length / 2]);
    }
} //TODO для массивов [1, 3] [2, 7] странно находит медиану
