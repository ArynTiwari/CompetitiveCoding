package LeetCode.Strings;

// 'A' - 'a' = 32, this is true for all chars
public class MakeStringBeautiful {
    public static String makeGood(String s) {
        if (s.length() == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (ans.length() == 0) {
                ans.append(s.charAt(i));
            }
            else if (ans.charAt(ans.length() - 1) - 32 == s.charAt(i) || ans.charAt(ans.length() - 1) + 32 == s.charAt(i)) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "abcC";
        System.out.println(makeGood(s));
    }
}
