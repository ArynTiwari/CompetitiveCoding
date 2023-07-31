package GFG.Array.Practise;

public class MaxOccured {
    public static int maxOccured(int L[], int R[]) {
        int n = L.length;
        int[] ans = new int[1000001];
        for (int i = 0; i < n; i++) {
            ans[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            ans[L[i]]++;
            ans[R[i] + 1]--;
        }

        int max = ans[0];
        int res = 0;
        for (int i = 1; i <= 100; i++) {
            ans[i] += ans[i - 1];
            if (max < ans[i]) {
                max = ans[i];
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int L[] = { 1, 4, 3, 1 };
        int R[] = { 15, 8, 5, 4 };
        System.out.println(maxOccured(L, R));

    }
}
