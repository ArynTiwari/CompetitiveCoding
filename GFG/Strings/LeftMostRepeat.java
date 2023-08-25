package GFG.Strings;

import java.util.ArrayList;

public class LeftMostRepeat {
    static void leftRepeat(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freqq = --freq[c - 'a'];
            lis.add(freqq);
        }
        for(int i : lis){
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        String s = "abcacabc";
        leftRepeat(s);
    }
}
