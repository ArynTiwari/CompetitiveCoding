package Algos.SlidingWindow;

class MaxLenAfterRem {
    public static int longestSubarray(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0, ans = Integer.MIN_VALUE, lastSeen = -1;
        while (j < n) {
            if (nums[j] == 0) {
                i = lastSeen + 1;
                lastSeen = j;
            }

            ans = Math.max(ans, j - i);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };
        System.out.println("Ans is :-> " + longestSubarray(a));
    }
}