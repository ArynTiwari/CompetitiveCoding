
package GFG.Array.Videos;
class Sol {
    // You need to insert the given element at the given index.
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        // if given index is last index we simply assign the element at last index.
        if (index == sizeOfArray - 1) {
            arr[index] = element;
            return;
        }
        // if given index is not last index we need to shift all the elements starting
        // from that index to the last element towards right by 1 position.
        arr[sizeOfArray - 1] = -1;

        // we iterate from last index to the index given.
        for (int i = sizeOfArray - 1; i > index; i--) {
            // we simply swap the values at ith and (i-1)th index in the array.
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        // Then we insert the given element at given index.
        arr[index] = element;
    }
}

public class InsertAtIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int sizeOfArray = 6;
        int index = 2, element = 90;
        System.out.println(arr.length);
        Sol sol = new Sol();
        sol.insertAtIndex(arr, sizeOfArray, index, element);
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
