package LeetCode.Arrays.Medium;
;

public class RichestWealt {
  public static int maximumWealth(int[][] accounts) {
    int maxsum = 0;
    for (int i = 0; i < accounts.length; i++) {
      int currSum = 0;
      for (int j = 0; j < accounts[i].length; j++) {
        currSum += accounts[i][j];
      }
      maxsum = Math.max(maxsum, currSum);
    }
    return maxsum;

  }

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 } };
    System.out.println(maximumWealth(arr));
    System.out.println("Hello this is Aryan Tiwari");
  }
}
