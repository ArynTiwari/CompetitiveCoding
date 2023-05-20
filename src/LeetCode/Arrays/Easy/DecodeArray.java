package LeetCode.Arrays.Easy;

public class DecodeArray {
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] orig = new int[n + 1];
        orig[0] = first;
       
        for (int i = 1; i < orig.length; i++) {
            //encoded[i] = a[i-1]^a[i]
            // System.out.println(encoded[i]+ " "+ orig[i]);
            orig[i] = encoded[i-1] ^ orig[i-1];
        }
        return orig;
    }

    public static void main(String[] args) {
        int[] encoded = { 1, 2, 3 };
        int first = 1;
        int[] ans = decode(encoded, first);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
