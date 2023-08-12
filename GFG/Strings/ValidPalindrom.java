package GFG.Strings;

public class ValidPalindrom {
    public static boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        // System.out.println(s);
        return true;
    }

    public static void main(String[] args) {
        String a = "ab_a";
        System.out.println(isPalindrome(a));
    }
}
