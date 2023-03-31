package GFG.Array.Practise;

import java.util.*;

public class GeekANdNewJob {
    public static boolean containsUpperCaseAndNumber(String str) {
        boolean hasUpperCase = false;
        boolean hasNumber = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            }

            if (hasUpperCase && hasNumber) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.nextLine();
            if (containsUpperCaseAndNumber(str) == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
