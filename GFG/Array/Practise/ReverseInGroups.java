package GFG.Array.Practise;

import java.util.ArrayList;

public class ReverseInGroups {
    // Function to reverse every sub-array group of size k.
    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        for (int index = 0; index < arr.size(); index++) {
            System.out.print(arr.get(index)+" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 3, n = arr.size();
        reverseInGroups(arr, n, k);
    }
}