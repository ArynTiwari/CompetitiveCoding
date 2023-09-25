package LeetCode.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] a = new int[n];
        a[n - 1] = 0;
        Deque<Integer> st = new ArrayDeque<>();
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && temp[i] >= temp[st.peek()]) {
                st.pop();
            }
            int span = st.isEmpty() ? 0 : Math.abs(i - st.peek());
            a[i] = span;
            st.push(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 1, 3, 4, 1, 3, 8 };
        int[] ans = dailyTemperatures(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
