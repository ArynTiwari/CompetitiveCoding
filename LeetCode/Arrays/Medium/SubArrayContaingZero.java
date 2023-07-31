package LeetCode.Arrays.Medium;
;

public class SubArrayContaingZero {
    public static long zeroFilledSubarray(int[] nums) {
        long ans=0,count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] ==0){
                count+=1;
            }
            else{
                count=0;
            }
            ans = ans+count;
        } 
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,0,0,2,0,0,4};
        System.out.println(zeroFilledSubarray(arr));
    }
}
