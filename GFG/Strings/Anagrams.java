package GFG.Strings;

class Anagrams {
    static final int CHAR = 256;

    static boolean isPresent(String s, String t) {
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            if (i < t.length()) {
                charCount[t.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (charCount[i] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String txt = "geeksforgeeks";
        String pat = "frog";
        if (isPresent(txt, pat))
            System.out.println("Anagram search found");
        else
            System.out.println("Anagram search not found");
    }
}