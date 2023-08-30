package Algos.SlidingWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegative {
    public static long[] printFirstNegativeInteger(long a[], int n, int k) {
        long[] ans = new long[n - k + 1];
        Deque<Long> deque = new LinkedList<>();
        ArrayList<Long> anss = new ArrayList<>();
        int i = 0, j = 0;
        while (j < n) {
            if (a[j] < 0) {
                deque.add(a[j]);
            }
            if (j - i + 1 == k) {
                if (!deque.isEmpty()) {
                    anss.add(deque.peek());
                } else {
                    anss.add(0L);
                }
                if (a[i] < 0) {
                    deque.poll();
                }
                i++;
            }
            j++;
        }
        int x = 0;
        for (Long long1 : anss) {
            ans[x] = long1;
            x++;
            // System.out.println(long1);
        }
        return ans;
    }

    public static void main(String[] args) {
        long a[] = { -8, 2, 3, -6, 10 };
        printFirstNegativeInteger(a, a.length, 2);
    }
}
