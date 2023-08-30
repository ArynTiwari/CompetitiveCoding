package InterviewBit.Strings;

public class MinCharcToMakeStringPalindrome {
    public static int solve(String A) {
        int ans = 0;
        int i = 0, j = A.length() - 1;
        while (i < j) {
            if (A.charAt(i) == A.charAt(j)) {
                i++;
                j--;
            } else {
                ans = A.length() - j;
                i = 0;
                while (A.charAt(i) == A.charAt(j)) {
                    ans--;
                    i++;
                }
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "hqghumeaylnlfdxfi";
        System.out.println(solve(s));

    }
}
