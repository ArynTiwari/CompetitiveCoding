public class RotateMatrix {
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void rotate(int[][] arr) {
        int n = arr.length;
        // transpose the arr
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr[i][j], arr[j][i]);
            }
        }
        // reverse each row of the arr
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                swap(arr[left][i], arr[right][i]);
                left++;
                right--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
