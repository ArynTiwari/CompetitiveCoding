package GFG.Array.Videos;

class Solution {

    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) {

        int low = 0;
        int ans = Integer.MIN_VALUE;
        int high = N - 1;
        while (low <= high) {
            if (A[low] <= A[high]) {
                ans = Math.max(ans, high - low);
                low = 0;
                high--;
            }
            else {
                low++;
            }
        }
        return ans;
    }
}

public class MaxIndexDiff {
    public static void main(String[] args) {
        int[] A = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(Solution.maxIndexDiff(A, 9));
    }
}
