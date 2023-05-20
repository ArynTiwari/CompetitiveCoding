package LeetCode.Arrays.Medium;
;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        runningSum(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
