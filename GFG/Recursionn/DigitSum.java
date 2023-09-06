package GFG.Recursionn;

public class DigitSum {
    static int digSum(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        sum += n % 10;
        return digSum(n / 10, sum);
    }

    public static void main(String[] args) {
        System.out.println(digSum(11, 0));
    }
}
