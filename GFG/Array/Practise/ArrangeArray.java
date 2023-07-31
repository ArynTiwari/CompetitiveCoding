package GFG.Array.Practise;

public class ArrangeArray {
    static void arrangeArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = arr[x];
            arr[i] = x + (y % n) * n;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) arr[i] / n;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1, 3 };
        arrangeArray(arr);
    }
}
