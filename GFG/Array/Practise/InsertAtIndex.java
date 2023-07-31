package GFG.Array.Practise;

public class InsertAtIndex {
    static void insertAtIndev(int[] arr, int element, int index) {
        int n = arr.length;
        if (index == (n - 1)) {
            arr[index] = element;
        }
        arr[n - 1] = -1;

        // we iterate from last index to the index given.
        for (int i = n - 1; i > index; i--) {
            // we simply swap the values at ith and (i-1)th index in the array.
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        // Then we insert the given element at given index.
        arr[index] = element;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        insertAtIndev(arr, 4, 2);
    }

}
