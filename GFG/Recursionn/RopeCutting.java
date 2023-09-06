package GFG.Recursionn;

class RopeCutting {
    static int minRope(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }
        if (n < -1) {
            return -1;
        }
        int o = minRope(n - a, a, b, c);
        int p = minRope(n - b, a, b, c);
        int q = minRope(n - c, a, b, c);
        int r = Math.max(o, p);
        int res = Math.max(r, q);
        if (res == -1) {
            return -1;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(minRope(23, 12, 9, 11));
    }
}