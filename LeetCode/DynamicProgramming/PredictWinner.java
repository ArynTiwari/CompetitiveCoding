package LeetCode.DynamicProgramming;

public class PredictWinner {
    static int[][] dp = new int[23][23];

    static int solve(int[] a, int i, int j) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return a[j];
        }
        if (dp[i][j] != -1)
            return dp[i][j];
        int choseI = a[i] + Math.min(solve(a, i + 1, j - 1), solve(a, i + 2, j));
        int choseJ = a[j] + Math.min(solve(a, i + 1, j - 1), solve(a, i, j - 2));
        return dp[i][j] = Math.max(choseI, choseJ);

    }

    public static boolean predictTheWinner(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        for (int i = 0; i < 23; i++) {
            for (int j = 0; j < 23; j++) {
                dp[i][j] = -1;
            }
        }
        int player1Sum = solve(nums, 0, nums.length - 1);
        System.out.println(player1Sum);
        int player2Sum = totalSum - player1Sum;
        return player1Sum >= player2Sum;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 7, 6, 5, 6, 1 };
        System.out.println(predictTheWinner(nums));
    }
}
