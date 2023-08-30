package InterviewBit.BinarySearch;

public class BitonicSearch {
    public static int solve(int[] arr, int target) {
        int peakIndex = findPeak(arr);
        int increasingSearch = binarySearchAscending(arr, target, 0, peakIndex);

        if (increasingSearch != -1) {
            return increasingSearch;
        }

        return binarySearchDescending(arr, target, peakIndex + 1, arr.length - 1);
    }

    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static int binarySearchAscending(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchDescending(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 3, 9, 10, 20, 17, 5, 1 };
        int B = 20;
        System.out.println(solve(A, B));
    }
}
