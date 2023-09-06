package LeetCode.Arrays.Medium;

import java.util.Arrays;

public class ProductSelf {
    public static int[] productExceptSelf(int[] a) {
        int n = a.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for (int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= a[i];
        }
        curr = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(productExceptSelf(a));
    }
}
