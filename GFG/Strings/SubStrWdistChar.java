package GFG.Strings;

import java.util.HashMap;
import java.util.Map;

public class SubStrWdistChar {
    static String longestSubSt(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        int longestStart = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }

            charIndexMap.put(c, i);

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                longestStart = start;
            }
        }

        return s.substring(longestStart, longestStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcabcadef";
        System.out.println(longestSubSt(s));
    }
}
