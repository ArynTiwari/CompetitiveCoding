package GFG.Array.Practise;

import java.util.Scanner;

class So {
    long gdc(long N, long M) {
        if (M == 0) {
            return N;
        }
        return gdc(M, N % M);
    }

    long sum(long N, long M) {
        long first = 0;
        long second = 0;
        long gcd = gdc(N, M);
        first = N / gcd;
        second = M / gcd;

        return (first + second);
    }
}

public class GeekAndCoPrime {
    public static void main(String[] args) {
        So so = new So();
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        System.out.println(so.sum(N, 5));
        sc.close();
    }
}