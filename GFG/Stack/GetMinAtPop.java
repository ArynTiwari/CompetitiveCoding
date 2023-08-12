package GFG.Stack;

import java.util.Stack;

public class GetMinAtPop {
    public static Stack<Integer> _push(int a[], int n) {
        // your code here
        Stack<Integer> s = new Stack<>();
        s.push(a[0]);
        for (int i = 1; i < n; i++) {
            int x = s.peek();
            if (a[i] >= x) {
                s.push(x);
            } else {
                s.push(a[i]);
            }
        }
        return s;
    }

    // Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer> s) {
        // your code here
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int[] a = { 1, 6, 43, 1, 2, 0, 5 };
        _getMinAtPop(_push(a, n));
    }
}
