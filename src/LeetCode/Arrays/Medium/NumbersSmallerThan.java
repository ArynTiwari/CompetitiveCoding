package LeetCode.Arrays.Medium;
;
public class NumbersSmallerThan {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] aa = new int[nums.length];
        int[] occur = new int[101];
        for (int i = 0; i < nums.length; i++) {
            occur[nums[i]]++;
        }
        for (int i = 1; i < occur.length; i++) {
            occur[i]+=occur[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                aa[i]=0;
            }
            else{
                aa[i] = occur[nums[i]-1];
            }
        }
        return aa;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] ans =  smallerNumbersThanCurrent(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
