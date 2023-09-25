package GFG.Recursionn;

public class NaturalNumSum {
    static int sum(int n, int sum) {
        System.out.println(n + " " + sum);
        if (n == 0) {
            return sum;
        }
        return sum(n - 1, n + sum);
    }
    /*
     * 1. sum(5,0)
     * 2. sum(3,9)
     * 3. sum(3,12)
     * 4. sum(3,14)
     * 5. sum(2,16)
     */

    public static void main(String[] args) {
        System.out.println(sum(5, 0));
    }
}
