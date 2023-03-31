package GFG.Array.Videos;

public class LongestEvenOdd {
    static int maxEvenOdd(int[] arr) {
        int res = 1,curr=1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || arr[i] % 2 != 0 && arr[i - 1] % 2 == 0) {
                curr += 1;
                res = Math.max(curr, res);
            } else {
                curr=1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 6, 3, 8 };
        System.out.println(maxEvenOdd(arr));
    }
}
