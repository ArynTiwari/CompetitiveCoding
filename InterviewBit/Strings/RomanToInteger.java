package InterviewBit.Strings;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        char[] smbl = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] val = { 1, 5, 10, 50, 100, 500, 1000 };

        for (int i = 0; i < val.length; i++) {
            romanMap.put(smbl[i], val[i]);
        }

        int result = 0;
        int prevVal = 0; // To keep track of the previous value

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentVal = romanMap.get(c);

            if (currentVal < prevVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }

            prevVal = currentVal; // Update the previous value
        }

        return result;

    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
