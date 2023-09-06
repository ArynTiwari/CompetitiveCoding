package GFG.Recursionn;

public class JosephusProb {
    static int solve(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solve(n - 1, k) + k) % n;
    }

    static int josep(int n, int k) {
        return solve(n, k) + 1;
    }

    public static void main(String[] args) {
        System.out.println(josep(5, 3));
    }
}
