package GFG.Array.Practise;

public class SafePosition {
    static int safePos(int n, int k) {
        // code here
        if (n == 1) {
            return 1;
        }
        return (safePos(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 4, k = 2;
        System.out.println(safePos(n, k));
    }
}
