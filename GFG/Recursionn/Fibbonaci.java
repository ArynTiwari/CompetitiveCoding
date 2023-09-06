package GFG.Recursionn;

public class Fibbonaci {
    static int fib(int n) {
        int[] dp = new int[n + 1];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
