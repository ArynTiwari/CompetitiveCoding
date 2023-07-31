
package GFG.Array.Videos;

import java.util.ArrayList;

public class StockBuySell {
    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int buy = 0, sell = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] > A[i]) {
                sell++;
            } else {
                if (sell > buy) {
                    ArrayList<Integer> lis = new ArrayList<>();
                    lis.add(buy);
                    lis.add(sell);
                    list.add(lis);
                }
                buy = i + 1;
                sell = i + 1;
            }
        }  if (sell > buy) {
            ArrayList<Integer> lis = new ArrayList<>();
            lis.add(buy);
            lis.add(sell);
            list.add(lis);
        }
        return list;
    }

    static int maxProfit(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sum = sum + arr[i] - arr[i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = arr.length;
        System.out.println(stockBuySell(arr, n));
    }
}
