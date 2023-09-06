package LeetCode.Stack;

import java.util.Stack;

public class NextGreaterSmaller {
    static int[] greater(int[] a) {
        int[] ans = new int[a.length];
        Stack<Integer> st = new Stack<>();

        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[i] >= st.peek()) {
                st.pop();
            }
            int span = st.isEmpty() ? -1 : st.peek();
            ans[i] = span;
            st.push(a[i]);
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
        return ans;

    }

    static int[] smaller(int[] a) {
        int[] ans = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[i] <= st.peek()) {
                st.pop();
            }
            int span = st.isEmpty() ? -1 : st.peek();
            ans[i] = span;
            st.push(a[i]);
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        greater(a);
        System.out.println(" ");
        smaller(a);
    }
}
