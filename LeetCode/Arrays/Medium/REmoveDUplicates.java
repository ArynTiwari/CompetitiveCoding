package LeetCode.Arrays.Medium;
;

public class REmoveDUplicates {
    public static int removeDuplicate(int[] nums) {
        int ans = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[ans - 1] != nums[i]) {
                nums[ans] = nums[i];
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3 };
        System.out.println(removeDuplicate(nums));
    }
}
