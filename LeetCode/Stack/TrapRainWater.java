package LeetCode.Stack;

public class TrapRainWater {
    public static int trap(int[] height) {
        int ans = 0, n = height.length;
        int[] pre = new int[n];
        pre[0] = height[0];
        int[] suf = new int[n];
        suf[n - 1] = height[n - 1];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > pre[i - 1]) {
                pre[i] = height[i];
            } else {
                pre[i] = pre[i - 1];
            }
        }
        // for (int i : pre) {
        // System.out.print(i + " ");
        // }
        for (int j = n - 2; j >= 0; j--) {
            if (height[j] > suf[j + 1]) {
                suf[j] = height[j];
            } else {
                suf[j] = suf[j + 1];
            }
        }
        // for (int i : suf) {
        // System.out.print(i + " ");
        // }
        for (int i = 0; i < height.length; i++) {
            ans += Math.min(suf[i], pre[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
