package LeetCode.Arrays.Easy;

public class CheckIfRotated {
    
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                if (count > 1) {
                    return false;
                }
                ++count;
            }
        }

        return (count <= 1);
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 3, 4 };
        System.out.println(CheckIfRotated.check(nums));
    }
}
