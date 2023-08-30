package LeetCode.DynamicProgramming;

public class ClimbingStairs {
    private static int solve(int n, int[] a) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (a[n] != 0) {
            return a[n];
        }
        a[n] = solve(n - 1, a) + solve(n - 2, a);
        return a[n];
    }

    public static int climbStairs(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        return solve(n, a);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
