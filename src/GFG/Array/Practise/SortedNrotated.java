package GFG.Array.Practise;

public class SortedNrotated {
    public static boolean sortedRotated(int[] arr,int num) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < num - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[0] > arr[num - 1])
                count1++;

            if (arr[i] < arr[i + 1] && arr[0] < arr[num - 1])
                count2++;
        }

        if (count1 == 1 || count2 == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
