package GFG.Array.Videos;
public class EquliriumIndex {
    static void equlibrium(long[] arr){
        int sum=0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (int) (sum+arr[i]);
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
        long[] arr={1,3,5,2,2};
        equlibrium(arr);
    }
}
