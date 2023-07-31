package LeetCode.Arrays.Medium;

import java.util.Arrays;

class Solution9 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i, j;
        i = nums1.length;
        j = nums2.length;
        double median = 0.0;
        int[] num = new int[i + j];
        double n = num.length;
        System.arraycopy(nums1, 0, num, 0, i);
        System.arraycopy(nums2, 0, num, i, j);
        Arrays.sort(num);
        if (n % 2 == 0) {
            double z = n / 2;
            double e = num[(int) z];
            double f = num[(int) (z - 1)];
            median =  ((e + f) / 2);
        } else {
            double z = n / 2;
            median = num[(int) z];
        }
        return median;

    }
}

public class MedianOfTwoArray {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));
    }

}
