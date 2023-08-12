package GFG.Stack;

import java.util.Stack;

public class TheCelibrityProb {
    static boolean know(int a[][], int x, int y) {
        if (a[x][y] == 1) {
            return true;
        }
        return false;
    }

    // Function to find if there is a celebrity in the party or not.
    static int celebrity(int a[][], int n) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int x = st.peek();
            st.pop();
            int y = st.peek();
            st.pop();
            if (know(a, x, y)) {
                st.push(y);
            } else {
                st.push(x);
            }
        }
        int candidate = st.peek();
        int zeroCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[candidate][i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount != n) {
            return -1;
        }
        int colCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i][candidate] == 1) {
                colCount++;
            }
        }
        if (colCount != n - 1) {
            return -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int N = 2;
        int M[][] = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0, } };
        System.out.println(celebrity(M, N));
    }
}
