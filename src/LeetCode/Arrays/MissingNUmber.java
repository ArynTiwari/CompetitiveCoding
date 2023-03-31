package LeetCode.Arrays;

public class MissingNUmber {
    public static int missingNumber(int[] nums) {
        int numSum = 0, indxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numSum = numSum + nums[i];
            indxSum = indxSum + i;
        }
        return ((indxSum + nums.length) - numSum);
    }

    public static void main(String[] args) {
        int[] nums = {0,-10,1,3,-20};
        System.out.println(missingNumber(nums));

    }
}
