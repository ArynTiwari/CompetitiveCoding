package GFG.Array.Videos;

public class MaximumElement {
    static void maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max element is:" + max);
    }

    static void secondEle(int[] arr) {
        int first = 0, second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Second largest is: " + second);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 324, 45, 90, 0 };
        maxEle(arr);
        secondEle(arr);
    }
}
