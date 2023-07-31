package GFG.Array.Videos;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 2, 8, 7, 6, 1 };
        LeaderInArray.leader2(arr);
    }

    // static void leader(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // boolean flag = false;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] <= arr[j]) {
    // flag = true;
    // break;
    // }
    // }
    // if (flag == false) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    // }

    static void leader2(int[] arr) {
        int n = arr.length;
        int curr_ldr = arr[n - 1];
        System.out.print(curr_ldr+" ");
        for (int i = n - 2; i >= 0; i--) {
            if (curr_ldr < arr[i]) {
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }
}
