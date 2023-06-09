package LeetCode.Arrays.Medium;
;
public class StrictlyIncrease {
    public static boolean canBeIncreasing(int[] nums) {
        int count =0 ;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<=nums[i-1]){
                if(count>0) return false;
                count++;
                if(i>1 && nums[i]<= nums[i-2]){
                    nums[i] = nums[i-1];
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 100, 21, 100 };
        System.out.println(canBeIncreasing(a));

    }
}
