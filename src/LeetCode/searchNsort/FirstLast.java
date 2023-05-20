package LeetCode.searchNsort;

public class FirstLast {
    public static int firstI(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] > x) {
                r = mid - 1;
            } else if (a[mid] < x) {
                l = mid + 1;
            } else {
                if (mid == 0 || a[mid - 1] != a[mid]) {
                    return mid;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    static int lastI(int arr[], int x) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > arr[mid])
                low = mid + 1;
            else if (x < arr[mid])
                high = mid - 1;
            else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }

        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int first = firstI(nums, target);
        int last = lastI(nums, target);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 5, 7, 7, 8, 8, 10 };
        int[] ans = searchRange(a, 6);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
