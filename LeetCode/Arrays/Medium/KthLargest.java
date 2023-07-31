package LeetCode.Arrays.Medium;


import java.util.TreeMap;

public class KthLargest {
    static int kthLargest(int[] arr, int k) {
        int kk = arr.length - k;
        TreeMap<Integer, Integer> map = new TreeMap<>();// Creating HashMap
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        return map.get(kk);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 6, 4 };
        int key = 2;
        System.out.println(kthLargest(arr, key));
    }
}
