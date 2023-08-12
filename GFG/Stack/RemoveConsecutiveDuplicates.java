package GFG.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        int n = str.length();
        if (n == 1) {
            return str;
        }
        Deque<Character> s = new ArrayDeque<>();
        char c = str.charAt(n - 1);
        s.push(c);
        for (int i = n - 1; i >= 0; i--) {
            if (s.peek() != str.charAt(i)) {
                s.push(str.charAt(i));
            }
        }
        String ans = "";

        while (!s.isEmpty()) {
            ans += s.pop();
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "aaaa";
        String ans = removeConsecutiveDuplicates(s);
        System.out.println(ans);
    }
}