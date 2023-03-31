package GFG.Array.Practise;

import java.util.ArrayList;

public class StockBuySell {
    static ArrayList<ArrayList<Integer>> stockBuySell(int[] A, int n) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int buy = 0, sell = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                sell++;
            } else {
                if (sell > buy) {
                    ans.add(buy);
                    ans.add(sell);
                    list.add(ans);
                }
                buy = i + 1;
                sell = i + 1;
            }
        }
        if (sell > buy) {
            ans.add(buy);
            ans.add(sell);
            list.add(ans);
        }

        return list;
    }

    public static void main(String[] args) {
        int N = 5;
        int A[] = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(stockBuySell(A, N));
    }
}
