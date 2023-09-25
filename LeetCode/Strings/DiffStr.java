package LeetCode.Strings;

public class DiffStr {
    public static char findTheDifference(String s, String t) {
        int xor = 0;
        for (char ch : s.toCharArray()) {
            xor ^= ch;
        }
        for (char ch : t.toCharArray()) {
            xor ^= ch;
        }
        return (char) xor;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
