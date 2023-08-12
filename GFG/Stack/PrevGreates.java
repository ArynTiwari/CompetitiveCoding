package GFG.Stack;

import java.util.Stack;

public class PrevGreates {
    public static void prevGret(int[] a) {
        Stack<Integer> st = new Stack<>();
        int[] b = new int[a.length];
        b[0] = -1;
        st.push(a[0]);
        for (int i = 1; i < a.length; i++) {
            while (st.isEmpty() == false && a[i] >= st.peek()) {
                st.pop();
            }
            b[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static void nextGret(int[] a) {
        Stack<Integer> st = new Stack<>();
        int[] b = new int[a.length];
        b[a.length-1] = -1;
        st.push(a[a.length-1]);
        for (int i = a.length - 2; i >= 0; i--) {
            while (st.isEmpty() == false && a[i] >= st.peek()) {
                st.pop();
            }
            b[i] = st.isEmpty() ? -1 : st.peek();
            st.push(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] a = { 20, 30, 10, 5, 15 };
        nextGret(a);
    }
}
