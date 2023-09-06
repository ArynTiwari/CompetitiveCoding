package LeetCode.Stack;

import java.util.Stack;

public class SimplifPath {
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (token.equals("") || token.equals(".")) {
                continue;
            } else if (token.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(token);
            }
        }

        String result = "";
        for (String s : stack) {
            result += "/" + s;
        }

        return result.isEmpty() ? "/" : result;

    }

    public static void main(String[] args) {
        String s = "/home//foo/";
        System.out.println(simplifyPath(s));
    }
}
