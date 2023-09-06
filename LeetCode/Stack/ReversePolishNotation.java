package LeetCode.Stack;

import java.util.*;

public class ReversePolishNotation {
    public static int calculate(int val1, int val2, String tokens) {
        int result = 0;
        switch (tokens) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "*":
                result = val1 * val2;
                break;
            case "/":
                if (val2 != 0) {
                    result = val1 / val2;
                }
                break;
            default:
                break;
        }

        return result;
    }

    public static boolean isOperator(String c) {
        String operators = "+-*/";
        return operators.indexOf(c) != -1;
    }

    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                int result = calculate(val1, val2, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        if (stack.size() != 1) {
            return 0;
        }

        return stack.pop();

    }

    public static void main(String[] args) {
        String[] s = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(s));
    }
}
