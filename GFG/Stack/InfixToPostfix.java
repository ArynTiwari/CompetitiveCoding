package GFG.Stack;

import java.util.Stack;

public class InfixToPostfix {
    // Function to convert an infix expression to a postfix expression.

    static int precedence(char ch) {
        if (ch == '^')
            return 3;
        else if (ch == '/' || ch == '*')
            return 2;
        else if (ch == '+' || ch == '-')
            return 1;
        else
            return -1;
    }

    static boolean isChar(char c) {
        if (c == '/' || c == '*' || c == '+' || c == '-' || c == '^' || c == '(' || c == ')')
            return false;
        return true;
    }

    public static String infixToPostfix(String s) {
        // Your code here
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isChar(ch))
                ans += ch;
            else if (ch == '(')
                st.push(ch);
            else if (ch == ')') {
                while (st.peek() != '(') {
                    ans += st.pop();
                }
                st.pop();
            } else {
                while (st.isEmpty() == false && precedence(ch) <= precedence(st.peek())) {
                    ans += st.pop();
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty())
            ans += st.pop();
        return ans;
    }

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
    }
}
