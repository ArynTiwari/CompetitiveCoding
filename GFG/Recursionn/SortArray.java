package GFG.Recursionn;
public class SortArray {
    public static void sortArray(int[] nums, int i) {
        // if (nums.length == 1) {
        // return nums;
        // }
        // int mid = nums.length / 2;
        // int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        // int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        // return merge(left, right);
        if (i == 0) {
            return;
        }
        sortArray(nums, i - 1);
        int ele = nums[i];
        for (int j = i - 1; j >= 0; j--) {
            if (nums[j] > ele) {
                nums[j + 1] = nums[j];
                nums[j] = ele;
            } else {
                break;
            }
        }
        nums[i] = ele;
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int lLen = left.length;
        int rLen = right.length;
        int[] ans = new int[lLen + rLen];
        while (i < lLen && j < rLen) {
            if (left[i] < right[j])
                ans[k++] = left[i++];
            else
                ans[k++] = right[j++];

        }
        while (i < lLen) {
            ans[k++] = left[i++];
        }
        while (j < rLen) {
            ans[k++] = right[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 7, 6, 4, 5 };
        sortArray(arr, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
