package LeetCode.searchNsort;

import java.util.Arrays;

public class BinarySearch {
    public static int srch(int[] a, int x) {
        return Arrays.binarySearch(a, x);
    }

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int recursiveSearch(int[] nums, int l, int r, int target) {
        if (l > r) {
            return -1;
        } else {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                return recursiveSearch(nums, mid + 1, r, target);
            } else {
                return recursiveSearch(nums, l, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(srch(nums, 0));
    }
}
