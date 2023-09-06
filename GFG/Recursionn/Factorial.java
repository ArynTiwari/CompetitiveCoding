package GFG.Recursionn;

public class Factorial {
    static int fact(int n, int x) {
        if (n == 0) {
            return x;
        }
        return fact(n - 1, x * n);
    }

    public static void main(String[] args) {
        System.out.println(fact(5, 1));
    }
}
