package GFG.Array.Videos;
public class EquliriumIndex {
    static void equlibrium(int[] arr){
        int sum=0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum-=arr[i];
            if(sum==leftSum){
                System.out.println("The equlibrium element is: "+arr[i]);
                break;
            }
            leftSum +=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={-7, 1, 5, 2, -4, 3, 0};
        equlibrium(arr);
    }
}
