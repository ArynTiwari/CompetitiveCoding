package InterviewBit.Strings;

import java.math.BigInteger;

public class VersionCheck {
    public static int compareVersion(String a, String b) {
        int i = 0, j = 0, n = a.length(), m = b.length();

        while (i < n || j < m) {
            BigInteger num1 = BigInteger.ZERO;
            while (i < n && a.charAt(i) != '.') {
                num1 = num1.multiply(BigInteger.TEN).add(BigInteger.valueOf(a.charAt(i) - '0'));
                i++;
            }

            BigInteger num2 = BigInteger.ZERO;
            while (j < m && b.charAt(j) != '.') {
                num2 = num2.multiply(BigInteger.TEN).add(BigInteger.valueOf(b.charAt(j) - '0'));
                j++;
            }

            int compareResult = num1.compareTo(num2);
            if (compareResult < 0) {
                return -1;
            } else if (compareResult > 0) {
                return 1;
            }

            i++;
            j++;
        }
        return 0;
    }

    public static void main(String[] args) {
        String a = "444444444444444444444444";
        String b = "4444444444444444444444444";
        System.out.println(compareVersion(a, b));
    }
}
