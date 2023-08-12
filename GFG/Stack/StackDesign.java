package GFG.Stack;

import java.util.*;

public class StackDesign {
    static class MinStack {
        Stack<Integer> s;
        int min;

        public MinStack() {
            s = new Stack<>();
        }

        public void push(int x) {
            if (s.isEmpty()) {
                min = x;
                s.add(x);
            } else if (x <= min) {
                s.add(2 * x - min);
                min = x;
            } else {
                s.add(x);
            }
        }

        public void pop() {
            int t = s.peek();
            s.pop();
            if (t <= min) {
                int res = min;
                min = 2 * min - t;
                System.out.print(res);
            } else {
                System.out.print(t);
            }
        }

        public int top() {
            int t = s.peek();
            return ((t <= min) ? min : t);
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        System.out.println(st.getMin());
        st.push(-3);
    }
}
