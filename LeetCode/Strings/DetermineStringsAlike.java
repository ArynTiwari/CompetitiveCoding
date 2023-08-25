package LeetCode.Strings;

public class DetermineStringsAlike {
    public static boolean isVovel(char i) {
        return "aeiouAEIOU".indexOf(i) != -1;
    }

    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        if (n == 0) {
            return false;
        }
        int half = n / 2, leftHalf = 0, rightHalf = 0;
        for (int i = 0; i < n / 2; i++) {
            if (isVovel(s.charAt(i))) {
                leftHalf++;
            }
            if (isVovel(s.charAt(half++))) {
                rightHalf++;
            }

        }
        return leftHalf == rightHalf;
    }

    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}
