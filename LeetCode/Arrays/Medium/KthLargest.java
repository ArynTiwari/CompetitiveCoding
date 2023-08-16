package LeetCode.Arrays.Medium;

public class KthLargest {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static int part_algo(int[] arr, int l, int r) {
        int p = arr[l];
        int i = l;
        int j = r;
        while (i <= j) {
            if (arr[i] < p && arr[j] > p) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] >= p) {
                i++;
            }
            if (arr[j] <= p) {
                j--;
            }
        }
        swap(arr, l, j);
        return j;
    }

    static int kthLargest(int[] arr, int k) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int pivot = 0;
        while (true) {
            pivot = part_algo(arr, l, r);
            if (pivot == k - 1) {
                break;
            } else if (pivot > k - 1) {
                r = pivot - 1;
            } else {
                l = pivot + 1;
            }
        }
        return arr[pivot];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int key = 2;
        System.out.println(kthLargest(arr, key));
    }
}
