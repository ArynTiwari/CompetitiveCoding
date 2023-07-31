package GFG.Array.Videos;
public class MaxConsecutive {
    static int maxCons(int[] arr, int x) {
        int res = 0, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                curr += 1;
            } else {
                res = Math.max(res, curr);
                curr = 0;
            }

        }
        return Math.max(res, curr);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 0, 1, 1, 1 };
        System.out.println(maxCons(arr, 1));
    }
}
