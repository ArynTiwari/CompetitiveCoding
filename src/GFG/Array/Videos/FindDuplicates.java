package GFG.Array.Videos;
import java.util.*;

public class FindDuplicates {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int indx = arr[i] % n;
            arr[indx] += n;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] / n) >= 2) {
                res.add(i);
            }
        }
        if (res.size() == 0) {
            res.add(-1);
        }
        
        return res;
    }//Vasusharma24
    //viplove131sharma@gmail.com

    public static void main(String[] args) {
        int a[] = { 0, 3, 1, 2 };

        int n = a.length;

        System.out.println(duplicates(a, n));
    }
}
