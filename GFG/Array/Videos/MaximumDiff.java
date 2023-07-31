
package GFG.Array.Videos;
class Solution2 {
    public int max(int[] arr) {
        int res = arr[1] - arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // for (int j = i + 1; j < arr.length; j++) {
            // if (arr[j] - arr[i] > ans) {
            // ans = arr[j] - arr[i];
            // }
            // }
            res = Math.max(res, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }

        return res;
    }
}

public class MaximumDiff {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
        Solution2 sol = new Solution2();
        System.out.println(sol.max(arr));
    }

}
