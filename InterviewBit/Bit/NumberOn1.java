package InterviewBit.Bit;

public class NumberOn1 {
    public static int numSetBits(long a) {
        int count = 0;
        while (a > 0) {
            count += a & 1;
            a >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(numSetBits(11));
    }
}
