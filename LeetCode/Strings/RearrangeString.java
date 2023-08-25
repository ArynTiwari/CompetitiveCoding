package LeetCode.Strings;

public class RearrangeString {
    public static String reorganizeString(String s) {
        int[] mp = new int[26];
        for (char c : s.toCharArray()) {
            mp[c - 'a']++;
        }

        // Find the most frequent letter
        int max = 0, letter = 0;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] > max) {
                max = mp[i];
                letter = i;
            }
        }

        if (max > (s.length() + 1) / 2)
            return ""; // Impossible to rearrange

        char[] res = new char[s.length()];
        int i = 0;
        while (mp[letter]-- > 0) {
            res[i] = (char) (letter + 'a');
            i += 2;
        }

        // Distribute the remaining characters
        for (int j = 0; j < mp.length; j++) {
            while (mp[j]-- > 0) {
                if (i >= res.length)
                    i = 1;
                res[i] = (char) (j + 'a');
                i += 2;
            }
        }

        return String.valueOf(res);

    }

    public static void main(String[] args) {
        String s = "vvvlo";
        System.out.println(reorganizeString(s));
    }
}
