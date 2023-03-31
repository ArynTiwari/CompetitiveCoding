package GFG.Array.Practise;

public class MaxSecondMax {
    static void maxSecondMax(int[] arr) {
        int first = 0, second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == 0) {
            second = -1;
        }
        System.out.println(first+ " "+ second);
    }

    public static void main(String[] args) {
        int[] arr = { 10 ,10 ,10, 10 ,10 ,10 };

        maxSecondMax(arr);

    }
}
