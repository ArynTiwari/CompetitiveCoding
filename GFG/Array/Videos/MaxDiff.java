package GFG.Array.Videos;
public class MaxDiff {
    static int maxDiff(int[] arr) {
        int maxDif = arr[1] - arr[0];
        int minEle = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minEle = Math.min(minEle, arr[i]);
            maxDif = Math.max(maxDif, arr[i] - minEle);
        }
        return maxDif;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 10, 6, 4, 8, 1 };
        System.out.println(maxDiff(arr));
    }
}
