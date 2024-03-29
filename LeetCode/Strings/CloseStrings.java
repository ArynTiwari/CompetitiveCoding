package LeetCode.Strings;

import java.util.Arrays;

public class CloseStrings {
    public static boolean closeStrings(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++)
            freq1[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++)
            freq2[s2.charAt(i) - 'a']++;

        if (Arrays.equals(freq2, freq1)) {
            return true;
        }
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq2[i] == 0 && freq1[i] != 0)) {
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        if (Arrays.equals(freq2, freq1))
            return true;

        return false;
    }

    public static void main(String[] args) {
        String s1 = "uau", s2 = "ssx";
        System.out.println(closeStrings(s1, s2));
    }
}
