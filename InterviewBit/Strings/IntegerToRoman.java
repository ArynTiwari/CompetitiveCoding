package InterviewBit.Strings;

public class IntegerToRoman {
    static int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    static String[] smbl = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String intToRoman(int num) {
        String res = "";
        for (int i = 0; i < 13; i++) {
            if (num == 0) {
                break;
            }
            int howMany = num / val[i];
            while (howMany > 0) {
                res += smbl[i];
                howMany--;
            }
            num = num % val[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }
}
