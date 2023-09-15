package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {
    static int[] dp = new int[101];

    static int solve(int[] a, int s, int e) {
        if (s > e) {
            return 0;
        }
        if (dp[s] != -1) {
            return dp[s];
        }
        int skip = solve(a, s + 1, e);
        int steal = a[s] + solve(a, s + 2, e);
        return dp[s] = Math.max(steal, skip);
    }

    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return nums[0];
        }
        Arrays.fill(dp, -1);
        int a = solve(nums, 0, nums.length - 2);
        Arrays.fill(dp, -1);
        int b = solve(nums, 1, nums.length - 1);
        return Math.max(a, b);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1 };
        System.out.println(rob(a));

    }
}
