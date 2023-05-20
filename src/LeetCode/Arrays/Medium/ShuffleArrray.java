package LeetCode.Arrays.Medium;
;

public class ShuffleArrray {
    public static int[] shuffle(int[] nums, int n) {
        int tenBitNum = (int) (Math.pow(2, 10) - 1); // Geting a 10 bit number to extract the First encoded number
        for (int i = 0; i < n; i++) { // encoding the the y(i) and x(i) number in the i th index
            int secNum = nums[n + i] << 10;
            nums[i] = nums[i] | secNum;
        }
        for (int i = n - 1; i >= 0; i--) { // decoding the the y(i) and x(i) number in the i th index
            nums[2 * i + 1] = nums[i] >> 10;
            nums[2 * i] = nums[i] & tenBitNum;
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = arr.length;
        int[] ans = shuffle(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
