package GFG.Array.Videos;

public class MaxAppear {
   static int optmmaxOccur(int[] left, int[] right, int n) {
      int res = 0;
      int freq[] = new int[101];
      for (int i = 0; i < n; i++) {
         freq[left[i]]++;
         freq[right[i] + 1]--;
      }
      for (int i = 1; i < 100; i++) {
         freq[i] = freq[i - 1] + freq[i];
         if (freq[i] > freq[res]) {
            res = i;
         }
      }
      return res;
   }

   static int maxOccur(int[] left, int[] right, int n) {
      int res = 0;
      int freq[] = new int[100];
      for (int i = 0; i < n; i++) {
         for (int j = left[i]; j <= right[i]; j++) {
            freq[j] += 1;
         }
      }
      for (int i = 1; i < 100; i++) {
         if (freq[i] > freq[i - 1]) {
            res = i;
         }
      }
      return res;
   }

   public static void main(String[] args) {
      int[] left = { 1, 2, 4 };
      int[] right = { 4, 5, 7 };
      int n = left.length;
      System.out.println(optmmaxOccur(left, right, n));

   }
}
