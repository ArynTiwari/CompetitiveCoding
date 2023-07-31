package LeetCode.Arrays.Medium;
;

public class SingleNum {
    public static int singleNum(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 1, 1, 2 };
        System.out.println(singleNum(nums));
    }
}
