package GFG.Stack;

import java.util.Stack;

public class LargestRectWithAll1 {
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

    static int maxRect(int[][] m) {
        int c = m[0].length;
        int res = getMaxArea(m[0], c);
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (m[i][j] == 1) {
                    m[i][j] += m[i - 1][j];
                }
            }
            res = Math.max(res, getMaxArea(m[i], c));
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] binaryMatrix = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        int ans = maxRect(binaryMatrix);
        System.out.println(ans);
    }
}
