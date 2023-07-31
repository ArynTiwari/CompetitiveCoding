package GFG.Array.Practise;

public class MaximumCircularSum {
    public static int minimumSubArraySum(int[] arr) {
        int sum = arr[0], minSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.min(sum + arr[i], arr[i]);
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }

    public static int kadanes(int[] arr) {
        int sum = arr[0], maxE = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            maxE = Math.max(sum, maxE);
        }
        return maxE;
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int minSumm = minimumSubArraySum(nums);
        int normalSum = kadanes(nums);
        int cirCular = totalSum - minSumm;
        if (normalSum > 0) {
            return Math.max(normalSum, cirCular);
        }
        return normalSum;
    }

    public static void main(String[] args) {
        int[] a = { -3, -2, -3 };
        System.out.println(maxSubarraySumCircular(a));
    }
}