package LeetCode.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int k = 0, i = 1;
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        while (k < nums.length) {
            int sum = nums[k] + nums[k + i];
            if (sum == target) {
                res[0] = k;
                res[1] = i;
            }
            if (i == nums.length - 1) {
                k += 1;
            } else {
                i += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { -10, 7, 19, 15 };
        System.out.println(nums.length);
        // int[] res = twoSum(nums, 9);
        // for (int i = 0; i < res.length; i++) {
        // System.out.print(res[i] + " " + "\n");
        // }
    }
}
