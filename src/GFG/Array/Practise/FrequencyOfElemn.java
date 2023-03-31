package GFG.Array.Practise;

public class FrequencyOfElemn {
    static void freq(int[] arr, int P) {
        int n = arr.length;
        int[] newArr = new int[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = 0;
        }
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > n) {
        // continue;
        // }
        // if (arr[i] % (P + 1) > 0 && arr[i] % (P + 1) <= P) {
        // arr[(arr[i] % (P + 1)) - 1] += (P + 1);
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // arr[i] = arr[i] / (P + 1);
        // nt
        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] > n) {
                continue;
            }
            int temp = arr[i];
            newArr[temp - 1] += 1;
        }
        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    // }5 2 4 5 6 8 10

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 8 };
        int P = 5;
        freq(arr, P);
    }
}
