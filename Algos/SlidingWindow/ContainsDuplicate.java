package Algos.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int j = 0; j < nums.length; j++) {
            if (j > k) {
                set.remove(nums[j - k - 1]);
            }

            if (!set.add(nums[j])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
