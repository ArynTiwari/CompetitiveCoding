package GFG.Stack;

import java.util.Stack;

public class RemoveStars {
    public static String reve(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(charArray);
        return reversed;

    }

    public static String removeStars(String s) {

        Stack<Character> st = new Stack<>();
        String res = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '*') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }

        while (!st.isEmpty()) {
            res += st.pop();
        }
        res = reve(res);
        return res;
    }

    public static void main(String[] args) {
        String s = "*a*bcdef***d*d";
        System.out.println(removeStars(s));
    }
}
