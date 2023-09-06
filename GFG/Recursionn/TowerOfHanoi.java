package GFG.Recursionn;

public class TowerOfHanoi {
    static void print(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + a + " to " + c);
            return;
        }
        print(n - 1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        print(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 3;
        print(n, 'a', 'b', 'c');
    }
}
