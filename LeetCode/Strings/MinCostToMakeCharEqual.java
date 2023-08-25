package LeetCode.Strings;

public class MinCostToMakeCharEqual {
    public static long minimumCost(String s) {
        long ans = 0;
        int n = s.length();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                ans += Math.min(i + 1, n - i - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "010101";
        System.out.println(minimumCost(s));
    }
}
