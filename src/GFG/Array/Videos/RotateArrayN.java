package GFG.Array.Videos;
//Theta(d) time with Theta(1) auxilarry Space
public class RotateArrayN {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        int n = arr.length;
        System.out.println("Before Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        RotateArrayN.rotateN(arr, d);

        System.out.println("After Rotation");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateN(int[] arr, int d) {
        int n = arr.length;
        // int temp[] = new int[d];

        // for (int i = 0; i < d; i++) {
        // temp[i] = arr[i];
        // }

        // for (int i = d; i < n; i++) {
        // arr[i - d] = arr[i];
        // }

        // for (int i = 0; i < d; i++) {
        // arr[n - d + i] = temp[i];
        // }
        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);
    }

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
