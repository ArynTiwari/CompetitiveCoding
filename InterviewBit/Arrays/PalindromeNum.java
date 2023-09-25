package InterviewBit.Arrays;

public class PalindromeNum {
    static int rev(int n) {
        int ans = 0;
        while (n > 0) {
            ans = ans * 10 + n % 10;
            n = n / 10;
        }
        return ans;
    }

    public static int isPalindrome(int A) {
        if (A == rev(A)) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(isPalindrome(n));
    }
}
