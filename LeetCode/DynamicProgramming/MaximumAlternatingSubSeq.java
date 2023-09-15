package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class MaximumAlternatingSubSeq {
    static long[][] dp = new long[1000001][2];

    static long solve(int[] a, int i, int sign) {
        if (i >= a.length) {
            return 0;
        }
        if (dp[i][sign] != -1) {
            return dp[i][sign];
        }
        long skip = solve(a, i + 1, sign);
        long val = a[i];
        if (sign == 0) {
            val = -val;
        }
        long take = val + solve(a, i + 1, sign = 0);
        dp[i][sign] = Math.max(take, skip);
        return dp[i][sign];
    }

    public static long maxAlternatingSum(int[] nums) {
        for (long[] row : dp) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return solve(nums, 0, 1);
    }

    public static void main(String[] args) {
        int[] a = { 4, 2, 5, 3 };
        System.out.println(maxAlternatingSum(a));
    }
}
