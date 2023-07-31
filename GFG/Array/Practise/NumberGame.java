package GFG.Array.Practise;

public class NumberGame {
    static long lcm(long a, long b) {
        long lcm = (a * b) / gcd(a, b);
        return lcm;

    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static Long numGame(Long n) {
        // code here
        long divide = 1000000007L;
        long result = 1;
        for (long i = 1; i <= n; i++) {

            result = lcm(result, i) % divide;

        }
        return result % divide;

    }

    public static void main(String[] args) {
        long n = 4L;
        System.out.println(numGame(n));
    }
}
