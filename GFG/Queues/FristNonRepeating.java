package GFG.Queues;

import java.util.*;

public class FristNonRepeating {
    public static String FirstNonRepeating(String s) {
        int[] count = new int[26];
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++;
            q.add(c);
            while (!q.isEmpty()) {
                if (count[q.peek() - 'a'] > 1) {
                    q.poll();
                } else {
                    ans.append(q.peek());
                    break;
                }
            }
            if (q.isEmpty()) {
                ans.append('#');
            }

        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(FirstNonRepeating(s));
    }
}
