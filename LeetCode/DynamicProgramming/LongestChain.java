package LeetCode.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

public class LongestChain {
    static int[][] dp;

    static int solve(int[][] a, int i, int p) {
        if (i >= a.length) {
            return 0;
        }
        if (p != -1 && dp[i][p] != -1) {
            return dp[i][p];
        }
        int take = 0;
        if (p == -1 || a[p][1] < a[i][0]) {
            take = 1 + solve(a, i + 1, i);
        }
        int skip = solve(a, i + 1, p);
        return p != -1 ? dp[i][p] = Math.max(take, skip) : Math.max(take, skip);
    }

    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });
        dp = new int[1001][1001];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(pairs, 0, -1);
    }

    public static void main(String[] args) {
        int[][] pairs = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        System.out.println(findLongestChain(pairs));
    }
}
