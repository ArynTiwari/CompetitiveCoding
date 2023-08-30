package InterviewBit.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s) {
        StringBuilder ans = new StringBuilder();
        if (s.length == 0) {
            return "";
        }
        Arrays.sort(s);
        char[] first = s[0].toCharArray();
        char[] last = s[s.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] s = { "abcdefgh", "aefghijk", "abcefgh" };
        System.out.println(longestCommonPrefix(s));
    }
}
