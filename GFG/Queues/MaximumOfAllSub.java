package GFG.Queues;

import java.util.*;

public class MaximumOfAllSub {
    static List<Integer> maxInRange(int[] a, int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        int i = 0, j = 0;

        while (j < a.length) {
            while (!dq.isEmpty() && dq.peek() < j - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && a[j] >= a[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.offer(j);
            if (j - i + 1 == k) {
                ans.add(a[dq.peek()]);
                i++;
            }

            j++;
        }
        for (Integer integer : ans) {
            System.out.println(integer);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        maxInRange(a, 3);
    }
}
