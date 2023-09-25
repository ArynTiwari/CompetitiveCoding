package LeetCode.Arrays.Medium;

import java.util.*;

class MinAbsolutDiff {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        // List<List<Integer>> ans = new ArrayList<>();
        // Arrays.sort(arr);
        // int minDiff = Math.abs(arr[1]) - Math.abs(arr[0]);
        // int i = 0, n = arr.length;
        // while (i < n - 1) {
        // List<Integer> a = new ArrayList<>();
        // if (Math.abs(arr[i + 1]) - Math.abs(arr[i]) == minDiff) {
        // a.add(arr[i]);
        // a.add(arr[i + 1]);
        // ans.add(a);
        // }
        // i++;
        // }

        // return ans;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int currentDiff = Math.abs(arr[i + 1] - arr[i]);

            if (currentDiff < minDiff) {
                ans.clear();
                minDiff = currentDiff;
            }

            if (currentDiff == minDiff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                ans.add(pair);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 3, 4, -10, 23, 19, -4, -14, 27 };
        List<List<Integer>> ans = minimumAbsDifference(a);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}