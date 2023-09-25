package LeetCode.searchNsort.Binary;

import java.util.Arrays;

/* 
 * Brute Force :-> look for all pairs
 * Sort and look for pairs
 * 
*/
public class MinimiseMaxDiff {
    static boolean isValid(int[] nums, int mid, int pair) {
        int i = 0, count = 0, n = nums.length;
        while (i < n - 1) {
            if (nums[i + 1] - nums[i] <= mid) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count >= pair;
    }

    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int result = -1;
        int l = 0, r = nums[nums.length - 1] - nums[0];
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isValid(nums, mid, p)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 1, 2, 7, 1, 3 };
        int p = 2;
        System.out.println(minimizeMax(nums, p));
    }
}
