package GFG.Array.Practise;

import java.util.Arrays;

public class MeanMedian {
    public static int median(int A[], int N) {
        Arrays.sort(A);
        double median;
        if (A.length % 2 == 0)
            median = ((double) A[A.length / 2] + (double) A[A.length / 2 - 1]) / 2;
        else
            median = (double) A[A.length / 2];

        return (int) median;
        // Your code here
        // If median is fraction then conver it to integer and return
    }

    // Function to find median of the array elements.
    public static int mean(int A[], int N) {
        // Your code here
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return (int) sum / N;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 3, 4 };
        int N = arr.length;
        System.out.println("Mean is " + mean(arr, N));
        System.out.println("Median is " + median(arr, N));

    }
}
