package LeetCode.Arrays.Medium;
;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int high = n - 1, low = 0, water = 0;
        while (low < high) {
            int area = Math.min(height[low], height[high]) * (high-low);
            if (area > water) {
                water = area;
            }
            if (Math.min(height[low], height[high]) == height[low]) {
                low++;
            } else {
                high--;
            }
        }
        return water;

    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = { 3,0,0,2,0,4 };
        Solution sol = new Solution();
        System.out.println(sol.maxArea(height));
    }
}
