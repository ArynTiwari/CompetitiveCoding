package LeetCode.DynamicProgramming;

public class PredictWinner {
    static int solve(int[] a, int i, int j) {
        if (i >= a.length || j <= 0) {
            return 0;
        }
        int choseI = a[i] + Math.min(solve(a, i + 1, j - 1), solve(a, i + 2, j));
        int choseJ = a[j] + Math.min(solve(a, i + 1, j - 1), solve(a, i, j - 2));
        return Math.max(choseI, choseJ);

    }

    public static boolean predictTheWinner(int[] nums) {
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        int player1Sum = solve(nums, 0, nums.length - 1);
        System.out.println(player1Sum);
        int player2Sum = totalSum - player1Sum;
        return player1Sum >= player2Sum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 55, 6, 8 };
        System.out.println(predictTheWinner(nums));
    }
}
