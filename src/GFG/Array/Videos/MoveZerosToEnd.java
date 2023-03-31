package GFG.Array.Videos;

public class MoveZerosToEnd {
    static void moveToEnd(int[] arr) {

        int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != 0) {
        // arr[count++] = arr[i];
        // }
        // }
        // for (int i = count; i < arr.length; i++) {
        // arr[i] = 0;
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else if (count > 0) {
                arr[i - count] = arr[i];
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
        moveToEnd(arr);
    }
}
