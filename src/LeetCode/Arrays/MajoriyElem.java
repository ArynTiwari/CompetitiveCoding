package LeetCode.Arrays;

import java.util.Arrays;

public class MajoriyElem {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int major = (int) Math.ceil(n / 2), count = 0, ans = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {
                count++;

            }
            if (count > major) {
                ans = nums[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        System.out.println(majorityElement(arr));
    }
}
