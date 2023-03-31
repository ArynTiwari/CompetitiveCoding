package GFG.Array.Videos;

public class SlidingWIndowTech {
    static int maxSum(int[] arr, int k) {
        int ans = Integer.MIN_VALUE, curr = 0;
        for (int i = 0; i < k; i++) {
            curr = curr + arr[i];
        }
        ans = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i] - arr[i - k];
            ans = Math.max(ans, curr);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        System.out.println(maxSum(arr, 3));
    }
}
