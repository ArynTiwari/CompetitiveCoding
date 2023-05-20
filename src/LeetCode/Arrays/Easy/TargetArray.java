package LeetCode.Arrays.Easy;

import java.util.ArrayList;

public class TargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            target[j] = list.get(j);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 }, index = { 0, 1, 2, 2, 1 };
        int[] ans = new int[nums.length];
        ans = createTargetArray(nums, index);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}