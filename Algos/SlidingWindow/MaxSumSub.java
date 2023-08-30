package Algos.SlidingWindow;

import java.util.ArrayList;

class MaxSumSub {
    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int n) {
        long maxSum = Long.MIN_VALUE; // Initialize maxSum to the smallest possible value
        long currentSum = 0; // Initialize currentSum for the sliding window
        int j = 0; // Pointer for the start of the sliding window

        for (int i = 0; i < arr.size(); i++) {
            currentSum += arr.get(i); // Add the element at i to the current sum

            // Slide the window until its size becomes equal to k
            if (i - j + 1 == k) {
                maxSum = Math.max(maxSum, currentSum); // Update maxSum
                currentSum -= arr.get(j); // Remove the element at j from current sum
                j++; // Slide the window by moving the start pointer
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

    }
}