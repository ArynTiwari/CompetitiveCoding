package GFG.Array.Practise;

public class MinimumAdjacentDifference {
    public static int minAdjDiff(int a[]) {
        // Your code here
        int n = a.length;
        int sum = Math.abs(a[n - 1] - a[0]), minSum = sum;
        for (int i = 1; i < a.length; i++) {
            sum = Math.abs(a[i] - a[i - 1]);

            minSum = Math.min(minSum, sum);

        }
        return minSum;

    }

    public static void main(String[] args) {
        int[] arr = { 8, -8, 9, -9, 10, -11, 12 };
        System.out.println(minAdjDiff(arr));

    }
}
