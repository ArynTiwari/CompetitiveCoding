
package GFG.Array.Videos;
public class RangeSum {
    static void rangeSum(int[] arr, int q, int l, int r) {
        int n = arr.length;
        int ans = 0;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n - 1; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        for (int i = 1; i < q; i++) {
            if (l == 0) {
                ans = prefix[r];
                System.out.println(ans + " ");
            } else {
                ans = prefix[r] - prefix[l - 1];
                System.out.println(ans + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 2, 5 };
        rangeSum(arr, 3, 0, 3);

    }
}
