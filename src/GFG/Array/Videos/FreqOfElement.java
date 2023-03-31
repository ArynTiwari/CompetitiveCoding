package GFG.Array.Videos;

public class FreqOfElement {
    static void printFreq(int[] arr) {
        int n = arr.length;
        int freq = 1, i = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq += 1;
                i += 1;
            }
            System.out.println("Freq of " + arr[i - 1] + " is " + freq);
            i += 1;
            freq = 1;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println("Freq of " + arr[i - 1] + " is " + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
        printFreq(arr);
    }
}
