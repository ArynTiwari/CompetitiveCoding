package LeetCode.DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubSeq {
    static int[][] dp;

    static int solve(int[] a, int i, int p) {
        if (i >= a.length) {
            return 0;
        }
        if (p != -1 && dp[i][p] != -1) {
            return dp[i][p];
        }
        int take = 0;
        if (p == -1 || a[i] > a[p]) {
            take = 1 + solve(a, i + 1, i);
        }
        int skip = solve(a, i + 1, p);
        return p != -1 ? dp[i][p] = Math.max(skip, take) : Math.max(skip, take);
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n + 1][n + 1];
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return solve(nums, 0, -1);
    }

    public static void main(String[] args) {
        int[] a = { 10, 9, 2, 5, 3, 7, 101, 18 };
        System.out.println(lengthOfLIS(a));
    }
}
