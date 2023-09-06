package LeetCode.Stack;

import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        int[] ans;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {

            while (asteroids[i] < 0 && !st.isEmpty() && st.peek() > 0) {
                int sum = asteroids[i] + st.peek();
                if (sum < 0) {
                    st.pop();
                } else if (sum > 0) {
                    asteroids[i] = 0;
                } else {
                    st.pop();
                    asteroids[i] = 0;
                }
            }
            if (asteroids[i] != 0) {
                st.push(asteroids[i]);
            }
        }
        for (Integer integer : st) {
            System.out.print(integer + " ");
        }
        ans = new int[st.size()];
        int i = ans.length - 1;
        while (!st.isEmpty()) {
            ans[i--] = st.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 10, 2, 3, -5 };
        System.out.println(asteroidCollision(a));
    }
}
