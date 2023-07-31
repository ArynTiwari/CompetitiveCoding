package GFG.Array.Practise;

public class MaximumIndex {
    static int maxIndex(int[] arr) {
        int N = arr.length;
        int low = 0;
        int ans = Integer.MIN_VALUE;
        int high = N - 1;
        while (low <= high) {
            if (arr[low] <= arr[high]) {
                ans = Math.max(ans, high - low);
                low = 0;
                high--;
            } else {
                low++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(maxIndex(arr));

    }
}
