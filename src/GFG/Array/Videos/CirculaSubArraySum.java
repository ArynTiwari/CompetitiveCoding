package GFG.Array.Videos;

public class CirculaSubArraySum {
    // static int circularSum(int[] arr) {
    // int res = arr[0], n = arr.length;
    // for (int i = 0; i < arr.length; i++) {
    // int cur_sum = arr[i];
    // int curr_max = arr[i];
    // for (int j = 1; j < arr.length; j++) {
    // int index = (i + j) % n;
    // cur_sum = cur_sum + arr[index];
    // curr_max = Math.max(curr_max, cur_sum);
    // }
    // res = Math.max(res, curr_max);
    // }
    // return res;
    // }

    static int normalMaxSum(int arr[], int n) {
        int res = arr[0];

        int maxEnding = arr[0];

        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);

            res = Math.max(maxEnding, res);
        }

        return res;
    }

    static int overallMaxSum(int arr[], int n) {
        int max_normal = normalMaxSum(arr, n);

        if (max_normal < 0)
            return max_normal;

        int arr_sum = 0;

        for (int i = 0; i < n; i++) {
            arr_sum += arr[i];

            arr[i] = -arr[i];
        }

        int max_circular = arr_sum + normalMaxSum(arr, n);

        return Math.max(max_circular, max_normal);
    }

    public static void main(String[] args) {
        int[] arr = { 8, -4, 3, -5, 4 };
        System.out.println(overallMaxSum(arr, arr.length));

    }
}
