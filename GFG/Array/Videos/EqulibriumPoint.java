package GFG.Array.Videos;

public class EqulibriumPoint {
    //compute prefix and suffix sum arry
    //travel both and if index and valur m,atches return true

    static boolean optmIsEquil(int[] arr){
       int leftSum=0,rightSum=0;
       for (int i = 0; i < arr.length; i++) {
            rightSum+=arr[i];        
       }
       for (int i = 0; i < arr.length; i++) {
            rightSum-=arr[i];
            if(leftSum==rightSum){
                return true;
            }
            leftSum+=arr[i];
       }
        return false;
    }
    static boolean isEqulib(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSUm=0,rightSum=0;
            for (int j = 0; j < i; j++) {
                leftSUm +=arr[j];
            }
            for (int k = i+1; k < arr.length; k++) {
                rightSum+=arr[k];
            }
            if(leftSUm==rightSum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 4,1};
        System.out.println(optmIsEquil(arr));
    }
}
