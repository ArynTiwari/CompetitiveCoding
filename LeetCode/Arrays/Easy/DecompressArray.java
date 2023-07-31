package LeetCode.Arrays.Easy;
import java.util.*;
public class DecompressArray {
    public static int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i+=2) {
            int size = nums[i], value = nums[i+1];
            while (size -- >0) {
                list.add(value);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {1,1,100,3};
        decompressRLElist(a);
    }
}
