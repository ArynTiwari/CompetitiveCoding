package GFG.Array.Videos;

public class ReverseArray {
    static void reverse(int[] arr){
        int low=0;
        int high = arr.length - 1;
        while (low<high) {
            int temp;
            temp=arr[low];
            arr[low] = arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2};
        reverse(arr);
    }
}
