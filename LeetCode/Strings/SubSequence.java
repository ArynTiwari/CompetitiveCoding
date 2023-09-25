package LeetCode.Strings;

public class SubSequence {
    public static boolean isSubsequence(String s, String t) {
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

    // static boolean solve(String s, String t, int i, String taken, String
    // notTaken) {
    // if (i == s.length()) {
    // return taken.equals(s) || notTaken.equals(s);
    // }
    // taken += t.charAt(i);
    // return solve(s, t, i + 1, taken, notTaken);

    // }
    public static void solve(String s, String t, int i, String taken, String notTaken) {
        // Base case: If we have reached the end of s, print both taken and notTaken.
        if (i == s.length()) {
            System.out.println("Taken: " + taken);
            System.out.println("Not Taken: " + notTaken);
            return;
        }

        // Take the character at index i from t and update taken.
        solve(s, t, i + 1, taken + t.charAt(i), notTaken);

        // Don't take the character at index i from t and update notTaken.
        solve(s, t, i + 1, taken, notTaken);
    }

    static boolean isSub(String s, String t) {
        solve(s, t, 0, "", "");
        return false;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSub(s, t));
    }
}
