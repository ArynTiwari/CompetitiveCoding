package GFG.Recursionn;

public class NaturalNumSum {
    static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        return sum(n - 1, n + sum);
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 0));
    }
}
