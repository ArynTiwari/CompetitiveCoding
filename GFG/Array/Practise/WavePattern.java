package GFG.Array.Practise;

public class WavePattern {
    public static void convertToWave(int[] a) {
        // code here
        int n = a.length;
        if (n % 2 == 0) {
            for (int i = 1; i < a.length; i = i + 2) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;

            }
        }
        else{
            for (int i = 1; i < a.length-1; i=i+2) {
                int temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2,4,7,8,9,10 };
        convertToWave(arr);
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
       }
    }
}
