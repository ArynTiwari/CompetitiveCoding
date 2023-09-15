package GFG.Recursionn;

public class SubSetSum {
    static void printSum(int[] a, int i, int sum, int target) {
        if (i == a.length) {
            System.out.println(sum == target);
            return;
        }
        printSum(a, i + 1, sum + a[i], target);
        printSum(a, i + 1, sum, target);
    }

    public static void main(String[] args) {
        int[] a = { 10, 5, 2, 3, 6 };
        printSum(a, 0, 0, 8);
    }
}
