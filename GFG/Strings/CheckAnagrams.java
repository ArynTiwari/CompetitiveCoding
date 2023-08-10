package GFG.Strings;

public class CheckAnagrams {
    public static boolean isAnagram(String a, String b) {

        // Your code here
        int[] count = new int[256];
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) ]++;
        }
        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i)]--;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
