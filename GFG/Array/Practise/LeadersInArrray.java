package GFG.Array.Practise;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArrray {
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
       int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;

    }

    public static void main(String[] args) {
        int[] arr = { 10, 2, 8, 7, 6, 1 };
        int n = arr.length;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2 = leaders(arr, n);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

    }
}
