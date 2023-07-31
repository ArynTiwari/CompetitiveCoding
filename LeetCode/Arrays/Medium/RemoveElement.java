package LeetCode.Arrays.Medium;


import java.util.Arrays;

public class RemoveElement {
    public static void removeElement(int[] nums, int val) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }
        Arrays.sort(nums);
        System.out.println("Nmber of non-valued elements is:"+(nums.length -x));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    public static void main(String[] args) {
        int[] nums = { 7,25,21,2,20,7,24,9,24,24,6,22,5,1,21,17,18,29,25,9,8,27,6,18,8,5,27,5,0,29,16,29,24,18,23,14,25,17,15,20,11,22,4,17,15,0,4,3,21,21,12,0,10,10,21,19,15,23,16,7,14,12,7,8,0,0,14,0,18,22,8,21,6,12 };
        int val = 26;
        RemoveElement.removeElement(nums, val);
    }
}
