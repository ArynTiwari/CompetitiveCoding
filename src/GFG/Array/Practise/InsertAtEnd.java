package GFG.Array.Practise;

public class InsertAtEnd {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int elem=50;
        System.out.println(arr.length);
        arr[arr.length-1]=elem;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
