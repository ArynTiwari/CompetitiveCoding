package GFG.Array.Practise;

import java.util.*;

public class ThreeSum {
    static List<List<Integer>> res = new ArrayList<>();

    public static void twoSum(int[] nums, int target, int i, int j) {
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                while (i < j && nums[i] == nums[i++]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }
                res.add(null);
                i++;
                j--;

            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n < 3) {
            return List.of();
        }
        res.clear();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int n1 = nums[i];
            int target = -n1;
            twoSum(nums, target, i + 1, n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 0, 1, 2, 2 };
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> list : ans) {
            System.out.print(list + " ");
        }

    }
}
