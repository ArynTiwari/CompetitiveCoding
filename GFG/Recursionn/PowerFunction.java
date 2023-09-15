package GFG.Recursionn;

public class PowerFunction {
    static long power(int b, int e) {
        if (e == 0) {
            return 1;
        }
        long temp = power(b, e / 2);
        temp = (temp * temp) % 1000000007;

        if (e % 2 == 0) {
            return temp % 1000000007;
        } else {
            return (temp * b) % 1000000007;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(12, 21));
    }
}
