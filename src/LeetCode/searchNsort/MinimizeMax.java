package LeetCode.searchNsort;

public class MinimizeMax {
    static boolean isValid(int[] nums, int mid) {
        int n = nums.length;
        long[] trial = new long[n];
        System.arraycopy(nums, 0, trial, 0, n);

        for (int i = 0; i < trial.length - 1; i++) {
            if (trial[i] > mid) {
                return false;
            }
            long buffer = mid - trial[i];
            trial[i + 1] = (int) (trial[i + 1] - buffer);
        }
        return trial[n - 1] <= mid;
    }

    public static int minimizeArrayValue(int[] nums) {
        int  max = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int l = 0, r = max;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isValid(nums, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 7, 1, 6 };
        System.out.println(minimizeArrayValue(nums));
    }
}
