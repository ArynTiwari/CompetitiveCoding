package GFG.Array.Practise;

public class TrappingRainWater {
    static void trappingWater(int arr[], int n) {
        long sum = 0;
        int[] l = new int[n];
        l[0] = arr[0];
        int[] r = new int[n];
        r[n - 1] = arr[n - 1];
        for (int i = 1; i < l.length; i++) {
            l[i] = Math.max(l[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            r[i] = Math.max(r[i + 1], arr[i]);
        }
        for (int i = 0; i < r.length; i++) {
            sum += Math.max(0, Math.min(l[i], r[i]) - arr[i]);
        }
        System.out.println(sum);
        // return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1,1,5,2,7,6,1,4,2,3 };
        int n = arr.length;
        // System.out.println(trappingWater(arr, n));
        trappingWater(arr, n);
    }
}
