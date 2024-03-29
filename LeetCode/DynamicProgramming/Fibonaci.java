package LeetCode.DynamicProgramming;

public class Fibonaci {
    public void multiply(long F[][], long M[][]) {
        long x = F[0][0] % 1000000007 * M[0][0] % 1000000007 + F[0][1] % 1000000007 * M[1][0] % 1000000007;
        long y = F[0][0] % 1000000007 * M[0][1] % 1000000007 + F[0][1] % 1000000007 * M[1][1] % 1000000007;
        long z = F[1][0] % 1000000007 * M[0][0] % 1000000007 + F[1][1] % 1000000007 * M[1][0] % 1000000007;
        long w = F[1][0] % 1000000007 * M[0][1] % 1000000007 + F[1][1] % 1000000007 * M[1][1] % 1000000007;

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    public void power(long F[][], int n) {
        if (n == 0 || n == 1)
            return;
        long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }

    public int solve(int A) {
        long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
        if (A == 0)
            return 0;
        power(F, A - 1);
        F[0][0] = F[0][0] % 1000000007;
        return (int) F[0][0];
    }

    public static void main(String[] args) {

    }
}
