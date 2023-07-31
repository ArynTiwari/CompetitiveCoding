package GFG.Array.Practise;
//0 is neither consodered as positive or negative

public class SmallestPositive {
    static int missinNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int ci = arr[i] - 1;
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[ci]) {
                int temp = arr[i];
                arr[i] = arr[ci];
                arr[ci] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    static int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                // changing the position of negative numbers and 0.
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // incrementing count of non-positive integers.
                j++;
            }
        }
        return j;
    }

    // Finding the smallest positive missing number in an array
    // that contains only positive integers.
    static int findMissingPositive(int arr[], int size) {
        int i;
        // marking arr[i] as visited by making arr[arr[i] - 1] negative.
        // note that 1 is subtracted because indexing starts from 0 and
        // positive numbers start from 1.
        for (i = 0; i < size; i++) {
            if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }

        for (i = 0; i < size; i++) {
            if (arr[i] > 0) {
                // returning the first index where value is positive.
                // 1 is added because indexing starts from 0.
                return i + 1;
            }
        }
        return size + 1;
    }

    // Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size) {
        // first separating positive and negative numbers.
        int shift = segregate(arr, size);

        int arr2[] = new int[size - shift];
        int j = 0;
        // shifting the array to access only positive part.
        for (int i = shift; i < (size); i++) {
            arr2[j] = arr[i];
            j++;
        }

        // calling function to find result and returning it.
        return findMissingPositive(arr2, j);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        // int n = arr.length;
        System.out.println(missinNumber(arr));
    }
}
