class Transpose {
    static void swap(int mat[][], int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                swap(arr, i, j);
            }
        }
        for (int is = 0; is < arr.length; is++) {
            for (int i = 0; i < arr[is].length; i++) {
                System.out.print(arr[is][i] + " ");
            }
        }
    }
}