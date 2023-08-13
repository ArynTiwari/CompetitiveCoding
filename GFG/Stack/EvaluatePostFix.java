package GFG.Stack;

import java.util.Stack;

public class EvaluatePostFix {
    public static int evaluatePostFix(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                st.add(ch - '0');
            } else if (ch == '*') {
                int a = st.pop();
                int b = st.pop();
                st.add(b * a);
            } else if (ch == '+') {
                int a = st.pop();
                int b = st.pop();
                st.add(b + a);
            } else if (ch == '/') {
                int a = st.pop();
                int b = st.pop();
                st.add(b / a);
            } else if (ch == '-') {
                int a = st.pop();
                int b = st.pop();
                st.add(b - a);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String s = "231*+9-";
        System.out.println(evaluatePostFix(s));
    }
}
