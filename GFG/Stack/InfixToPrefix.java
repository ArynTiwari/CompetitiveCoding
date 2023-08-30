package GFG.Stack;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class InfixToPrefix {
    // static String reverse(String input) {
    //     StringBuilder reversed = new StringBuilder();
    //     for (int i = input.length() - 1; i >= 0; i--) {
    //         reversed.append(input.charAt(i));
    //     }
    //     return reversed.toString();
    // }

    static int precedence(char ch) {
        // Use a map for operator precedence
        Map<Character, Integer> precedenceMap = new HashMap<>();
        precedenceMap.put('^', 5);
        precedenceMap.put('/', 4);
        precedenceMap.put('*', 3);
        precedenceMap.put('+', 2);
        precedenceMap.put('-', 1);

        return precedenceMap.getOrDefault(ch, -1);
    }

    static boolean isOperator(char c) {
        return c == '/' || c == '*' || c == '+' || c == '-' || c == '^' || c == '(' || c == ')';
    }

    public static String infixToPrefix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (!isOperator(c)) {
                ans.append(c);

            } else if (c == ')') {
                st.push(c);
            } else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    ans.append(st.pop());

                }
                st.pop(); // Pop the '('
            } else {
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    ans.append(st.pop());

                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());

        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String infixExpression = "x+y/z-w*u";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Prefix: " + prefixExpression);
    }
}
