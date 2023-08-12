package GFG.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * If grater element on left side:-> index of(curr - prevGreates)
 * else index+1
 */
public class StackSpan {
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int sp = 1;
            for (int j = i - 1; j >= 0 && a[j] <= a[i]; j--) {
                sp++;
            }
            System.out.print(sp + " ");
        }
    }

    static void spanStock(int[] a) {
        int[] b = new int[a.length];
        b[0] = 1;
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                stk.push(i - 1);
                b[i] = i - stk.peek();
            } else {
                while (stk.isEmpty() == false && a[i] > a[stk.peek()]) {
                    stk.pop();
                }
                b[i] = stk.isEmpty() ? i + 1 : i - stk.peek();
               
            }
        }
        // for (int i = 0; i < b.length; i++) {
        //     System.out.print(b[i] + " ");
        // }
    }

    public static void main(String[] args) {
        int[] a = { 60, 10, 20, 30, 40, 35, 50, 70, 80 };
        print(a);
        System.out.println("");
        spanStock(a);
    }
}
