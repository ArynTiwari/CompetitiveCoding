package GFG.SearchSort;

public class BinarySearch {
    static int binarySearch(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 2));
    }
}
