package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNum {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int indexx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                indexx = nums[i] * -1 - 1;
            } else {
                indexx = nums[i] - 1;
            }

            if (nums[indexx] > 0) {
                nums[indexx] = -nums[indexx];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = new ArrayList<>();
        ans = findDisappearedNumbers(nums);
        for (Integer integer : ans) {
            System.out.println(integer);
        }
    }
}