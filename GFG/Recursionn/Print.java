package GFG.Recursionn;

public class Print {
    static void fun(int cnt, int n) {
        System.out.println(cnt);
        if (cnt == n) {
            return;
        }
        fun(cnt + 1, n);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = 0;
        return ans;

    }

    static void print(int n, int k) {
        if (n == -1) {
            return;
        }
        System.out.println(n);
        print(n - 1, 0);
    }

    public static void main(String[] args) {
        print(5, 1);
    }
}
