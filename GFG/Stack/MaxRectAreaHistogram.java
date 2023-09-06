package GFG.Stack;

import java.util.Stack;

public class MaxRectAreaHistogram {
    public static int getMaxArea(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int tp;
        int curr;
        for (int i = 0; i < n; i++) {
            while (s.isEmpty() == false && arr[s.peek()] >= arr[i]) {
                tp = s.peek();
                s.pop();
                curr = arr[tp] * (s.isEmpty() ? i : i - s.peek() - 1);
                res = Math.max(res, curr);
            }
            s.push(i);
        }
        while (s.isEmpty() == false) {
            tp = s.peek();
            s.pop();
            curr = arr[tp] * (s.isEmpty() ? n : n - s.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;
    }

    public static void main(String[] args) {
        int N = 7;
        int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println(getMaxArea(arr, N));
    }
}
