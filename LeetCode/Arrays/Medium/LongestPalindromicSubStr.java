package LeetCode.Arrays.Medium;

public class LongestPalindromicSubStr {
    static boolean solve(boolean[][] dp, int i, int j, String s) {
        if (i == j) {
            return dp[i][j] = true;
        }
        if (j - i == 1) {
            if (s.charAt(i) == s.charAt(j)) {
                return dp[i][j] = true;
            } else {
                return dp[i][j] = false;
            }
        }
        if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
            return dp[i][j] = true;
        } else {
            return dp[i][j] = false;
        }
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int startIndex = 0;
        int maxlen = 0;
        boolean[][] dp = new boolean[n][n];
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                solve(dp, i, j, s);
                if (dp[i][j] == true) {
                    if (j - i + 1 > maxlen) {
                        startIndex = i;
                        maxlen = j - i + 1;
                    }
                }
            }
        }
        return s.substring(startIndex, maxlen);
    }

    public static void main(String[] args) {
        String str = "babdcd";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
}
