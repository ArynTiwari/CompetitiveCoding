package LeetCode.searchNsort;

import java.util.*;

public class TargetIndices {
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

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> lis = new ArrayList<>();
        int first = firstI(nums, target);
        int last = lastI(nums, target);
        System.out.println(first + " " + last);
        if (first == -1) {
            return lis;
        }
        for (int i = first; i <= last; i++) {
            lis.add(i);
        }
        Collections.sort(lis);
        return lis;

    }

    public static void main(String[] args) {
        int a[] = { 100, 1, 100 };
        int target = 100;
        List<Integer> list = targetIndices(a, target);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
