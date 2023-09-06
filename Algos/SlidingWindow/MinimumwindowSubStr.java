package Algos.SlidingWindow;

public class MinimumwindowSubStr {

    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, counter = t.length();
        while (end < s.length()) {
            final char a = s.charAt(end);
            if (map[a] > 0)
                counter--;
            map[a]--;
            end++;
            while (counter == 0) {
                if (minLen > end - start) {
                    minLen = end - start;
                    minStart = start;
                }
                final char b = s.charAt(start);
                map[b]++;
                if (map[b] > 0)
                    counter++;
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String s = "a", t = "b";
        System.out.println(" ");
        System.out.println(minWindow(s, t));
    }
}
