package Algos.SlidingWindow;

import java.util.Arrays;

public class KradiusSubArr {
    public static int[] getAverages(int[] nums, int k) {
        if (nums.length < k) {
            return new int[-1];
        }
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        if (n < 2 * k + 1) {
            return ans;
        }
        int left = 0, right = 2 * k, i = k, sum = 0, div = 2 * k + 1;
        for (int j = left; j <= right; j++) {
            sum += nums[j];
        }
        ans[i] = sum / div;
        i++;
        right++;
        while (right < n) {
            sum = sum + nums[right] - nums[left];
            ans[i] = sum / div;
            i++;
            right++;
            left++;

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        getAverages(a, 3);
    }
}
