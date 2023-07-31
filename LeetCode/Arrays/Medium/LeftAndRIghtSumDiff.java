package LeetCode.Arrays.Medium;
;

public class LeftAndRIghtSumDiff {
    public static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int leftSum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            maxSum -= nums[i];
            answer[i] = Math.abs(leftSum - maxSum);
            leftSum += nums[i];
        }

        return answer;

    }

    public static void main(String[] args) {
        int[] nums = { 10, 4, 8, 3 };
        int[] ans = leftRigthDifference(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
