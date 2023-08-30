package GFG.Strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumCharIndex {
    public static int minIndexChar(String str, String patt) {
        int ans = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Minimum Index: " + entry.getValue());
        }
        for (int i = 0; i < patt.length(); i++) {
            char c = patt.charAt(i);
            if (map.containsKey(c)) {
                ans = Math.min(ans, map.get(c));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String patt = "set";
        System.out.println(minIndexChar(str, patt));
    }
}
