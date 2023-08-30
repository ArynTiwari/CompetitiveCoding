package Algos.SlidingWindow;

public class MaxVovSub {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int maxVowels(String s, int k) {
        int ans = 0, i = 0, j = 0;
        int currCount = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            if (isVowel(c)) {
                currCount++;
            }
            if (j - i + 1 == k) {
                ans = Math.max(ans, currCount);
                if (isVowel(s.charAt(i))) {
                    currCount -= 1;
                }
                i++;
                // currCount = 0;

            }
            j++;
        }
        return ans;
    }
}
