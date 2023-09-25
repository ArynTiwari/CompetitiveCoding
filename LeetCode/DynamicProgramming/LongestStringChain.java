package LeetCode.DynamicProgramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * predecessor is a word with one extra char with order maintained
 */
public class LongestStringChain {
    static int[][] dp = new int[1001][1001];

    static boolean isPred(String s, String t) {
        if (t.length() - s.length() != 1) {
            return false;
        }
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {

            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }

    static int solve(String[] words, int prev, int curr) {
        if (curr == words.length)
            return 0;
        if (prev != -1 && dp[prev][curr] != -1) {
            return dp[prev][curr];
        }
        int take = 0, notTake = 0;
        if (prev == -1 || isPred(words[prev], words[curr])) {
            take = 1 + solve(words, curr, curr + 1);
        }
        notTake = solve(words, prev, curr + 1);
        return prev != -1 ? dp[prev][curr] = Math.max(take, notTake) : Math.max(take, notTake);
    }

    public static int longestStrChain(String[] words) {
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                dp[i][j] = -1;
            }
        }
        Comparator<String> lengthComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        Arrays.sort(words, lengthComparator);
        return solve(words, -1, 0);
    }

    public static void main(String[] args) {
        String[] words = { "a", "b", "ba", "abc", "abd", "bdca" };
        System.out.println(longestStrChain(words));
    }
}
