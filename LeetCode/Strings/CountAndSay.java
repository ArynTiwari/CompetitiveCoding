package LeetCode.Strings;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String say = countAndSay(n - 1);
        String res = "";
        for (int i = 0; i < say.length(); i++) {
            char c = say.charAt(i);
            int count = 1;
            while (i < say.length() - 1 && say.charAt(i) == say.charAt(i + 1)) {
                count++;
                i++;
            }
            res += String.valueOf(count) + String.valueOf(c);
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}
