package LeetCode.Stack;

import java.util.*;

public class SumOfSubArrMin {
    public static int sumSubarrayMins(int[] arr) {
        int[] nsl = new int[arr.length];
        int[] rsl = new int[arr.length];

        Deque<Integer> dq = new ArrayDeque<>();
        // for nsl
        for (int i = 0; i < nsl.length; i++) {
            while (!dq.isEmpty() && arr[i] <= arr[dq.peek()]) {
                dq.pop();
            }
            if (dq.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = dq.peek();
            }
            dq.push(i);
        }
        Deque<Integer> qd = new ArrayDeque<>();
        int n = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (qd.isEmpty()) {
                rsl[i] = n;
            } else {
                while (!qd.isEmpty() && arr[qd.peek()] > arr[i]) {
                    qd.pop();
                }
                rsl[i] = qd.isEmpty() ? n : qd.peek();
            }
            qd.push(i);
        }

        long sum = 0, MOD = 1000000007L;
        for (int i = 0; i < arr.length; i++) {
            long ls = i - nsl[i];
            long rs = rsl[i] - i;
            long total = ls * rs;
            long totalSum = arr[i] * total;
            sum = (sum + totalSum) % MOD;
        }
        // for (int i = 0; i < nsl.length; i++) {
        // System.out.print(nsl[i] + " ");
        // }
        return ((int) sum);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        System.out.println(sumSubarrayMins(arr));
    }
}
