package GFG.Recursionn;

public class SubSetPrint {
    static void print(String s, String cur, int i) {
        if (i == s.length()) {
            System.out.println(cur);
            return;
        }
        print(s, cur, i + 1);
        print(s, cur + s.charAt(i), i + 1);

    }

    public static void main(String[] args) {
        print("abc", " ", 0);
    }
}
