package GFG.Recursionn;

public class LuckyNumber {
    static boolean solve(int n, int count) {
        if (n % count == 0)
            return false;
        if (count > n)
            return true;
        return solve(n - (n / count), count + 1);
    }

    static boolean isLucky(int n) {
        return solve(n, 2);
    }

    public static void main(String[] args) {
        System.out.println(isLucky(19));
    }
}
