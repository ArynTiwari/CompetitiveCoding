package GFG.Strings;

public class SubSequence {
    public static boolean isSubSequence(String a, String b) {
        // code here
        int m = a.length(), n = b.length();
        int i = 0, j = 0;
        for (i = 0; i < m && j < n; i++) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            }
        }
        return (j == n);
    }

    public static boolean isSubSeqRecur(String s, String j, int m, int n) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (s.charAt(n - 1) == j.charAt(m - 1)) {
            return isSubSeqRecur(s, j, n - 1, m - 1);
        } else {
            return isSubSeqRecur(s, j, n - 1, m);
        }
    }

    public static void main(String[] args) {
        String a = "aryan";
        String b = "abc";
        boolean ans = isSubSequence(a, b);
        System.out.println(ans);
    }
}
