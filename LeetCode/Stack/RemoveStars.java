package LeetCode.Stack;

public class RemoveStars {
    public static String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == '*') {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
}
