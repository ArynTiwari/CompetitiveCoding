package LeetCode.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenth {
    public static boolean isValid(String s) {
        // Stack<Character> st = new Stack<>();
        // for (Character c : s.toCharArray()) {
        // if (st.isEmpty() || c == '[' || c == '{' || c == '(') {
        // st.push(c);
        // continue;
        // }
        // if (c == ')') {
        // if (st.peek() == '(') {
        // st.pop();
        // } else {
        // return false;
        // }
        // } else if (c == '}') {
        // if (st.peek() == '{') {
        // st.pop();
        // } else {
        // return false;
        // }
        // } else if (c == ']') {
        // if (st.peek() == '[') {
        // st.pop();
        // } else {
        // return false;
        // }
        // }
        // }
        // return st.isEmpty();
        Stack<Character> st = new Stack<>();
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsValue(c)) {
                st.push(c);
            } else if (bracketMap.containsKey(c)) {
                if (st.isEmpty() || st.pop() != bracketMap.get(c)) {
                    return false;
                }
            } else {
                // Handle invalid characters (if any)
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}
