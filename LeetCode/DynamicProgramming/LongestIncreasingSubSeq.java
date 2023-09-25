package LeetCode.DynamicProgramming;

public class LongestIncreasingSubSeq {
    static int solve(int[] nums, int prev, int curr) {
        if (curr == nums.length) {
            return 0;
        }
        int take = 0, notTake = 0;
        if (prev == -1 || nums[prev] < nums[curr]) {
            take = 1 + solve(nums, curr, curr + 1);
        }
        notTake = solve(nums, prev, curr + 1);
        return Math.max(take, notTake);
    }

    static int lis(int[] nums) {
        return solve(nums, -1, 0);
    }

    public static void main(String[] args) {
        int[] nums = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
        System.out.println(lis(nums));
    }
}
