package GFG.Array.Videos;

public class PrefixSum {
    static int getSum(int arr[], int l, int r) {
        if (l == 0) {
            return arr[r];
        }

        return arr[r] - arr[l - 1];

    }

    static int getWeightedSum(int[] arr, int l, int r) {
        int normalSum = 0, weightedSum = 0;
        int[] weightedSumPrefix = new int[arr.length];
        weightedSumPrefix[0] = 0;
        for (int i = l; i < r; i++) {
            weightedSumPrefix[i] = weightedSum + arr[i] - weightedSumPrefix[i - 1];
        }
        int[] prefixSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            normalSum = normalSum + arr[i];
            prefixSum[i] = normalSum;
        }
        return 0;
    }

    static int prefixSum(int[] arr, int l, int r) {
        int[] prefixSum = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            prefixSum[i] = sum;
        }
        if (l == 0) {
            return prefixSum[r];
        } else {
            return prefixSum[r] - prefixSum[l - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 9, 6, 5, 4 };
        int n = arr.length;
        int ps[];
        ps = new int[n];

        ps[0] = arr[0];

        for (int i = 1; i < n; i++)
            ps[i] = ps[i - 1] + arr[i];
        System.out.println(getSum(ps, 2, 6));
    }
}
