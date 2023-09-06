package LeetCode.Stack;

import java.util.Stack;

public class ValidateStackSequence {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0, m = popped.length, n = pushed.length;
        if (n != m) {
            return false;
        }
        Stack<Integer> st = new Stack<>();
        while (i < n && j < m) {
            st.push(pushed[i]);
            while (!st.isEmpty() && j < m && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
            i++;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 }, popped = { 4, 5, 3, 2, 1 };
        System.out.println(validateStackSequences(pushed, popped));
    }
}
