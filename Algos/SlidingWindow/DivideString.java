package Algos.SlidingWindow;

import java.util.ArrayList;

public class DivideString {
    public static String[] divideString(String s, int k, char fill) {
        ArrayList<String> ans = new ArrayList<>();
        int rem = s.length() % k;
        if (rem != 0) {
            rem = k - rem;
        }

        for (int i = 0; i < rem; i++) {
            s += fill;
        }
        System.out.println("String updated:-> " + s);
        int i = 0, j = 0;
        String st = "";
        while (++j < s.length()) {
            char c = s.charAt(j);
            st += c;
            if (j - i + 1 == k) {
                ans.add(st);
                st = "";
                i = j + 1;
            }

        }
        return ans.toArray(new String[ans.size()]);
    }

    public static void main(String[] args) {
        String s = "bb";
        divideString(s, 4, 'x');
    }
}
