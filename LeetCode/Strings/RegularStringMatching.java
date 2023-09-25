package LeetCode.Strings;

public class RegularStringMatching {
    public boolean isMatch(String s, String p) {
        int j = 0, i = 0;
        for (i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = p.charAt(j);
            char prev = j > 1 ? p.charAt(j - 1) : ' ';
            if (a == b)
                j++;
            else if (b == '*') {
                while (s.charAt(i) == prev) {
                    i++;
                }
                j++;
            } else {
                j += 1;
            }
        }
        return i == j;
    }
}
