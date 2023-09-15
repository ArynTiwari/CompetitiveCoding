
package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class HouseRobber1 {
    static int[] dp = new int[101];

    static int solve(int[] nums, int i) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int steal = nums[i] + solve(nums, i + 2);
        int skip = solve(nums, i + 1);
        return dp[i] = Math.max(steal, skip);

    }

    public static int rob(int[] nums) {
        Arrays.fill(dp, -1);
        return solve(nums, 0);
    }

    static int bottom(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        int[] store = new int[n + 1];
        int stl = 0, skp = 0;
        store[0] = 0;
        store[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            stl = nums[i - 1] + store[i - 2];
            skp = store[i - 1];
            store[i] = Math.max(stl, skp);
        }

        return store[n];
    }

    public static void main(String[] args) {
        int[] n = { 2, 7, 9, 3, 1 };
        System.out.println(rob(n));
        System.out.println(bottom(n));
    }
}
