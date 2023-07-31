package GFG.Array.Practise;

public class RearrangeArray {
    public static void rearrange(long arr[], int n) {
        int lastidx = n - 1;
        int firstidx = 0;
        int maxi = (int) (arr[n - 1] + 1);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[lastidx] % maxi) * maxi;
                lastidx--;
            } else {
                arr[i] += (arr[firstidx] % maxi) * maxi;
                firstidx++;
            }
        }
        for (int i = 0; i < n; i++)
            arr[i] /= maxi;

    }

    public static void main(String[] args) {
        int n = 11;
        long arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
        rearrange(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
