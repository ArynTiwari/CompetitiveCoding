package GFG.Array.Contest;

import java.util.Scanner;

public class ConversionToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            if (n == 1) {
                System.out.println(count);
            }
            if (n % 2 != 0) {
                n = n + 1;
                count++;
            }

            while (n % 2 == 0) {
                n = n / 2;
                count++;

            }
            System.out.println(count);
        }
        sc.close();
    }

}