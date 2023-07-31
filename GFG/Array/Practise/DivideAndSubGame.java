package GFG.Array.Practise;

public class DivideAndSubGame {
    static void divAndSub(int N) {
        // code here
        int[] a = new int[8];
        //divide result
        for(int i=0;i<4;i++){
            a[i] = Math.floorDiv(N, i+2);
        }
        for (int i = 4; i <8 ; i++) {
            a[i] = N-(i+2);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        divAndSub(3);
    }
}
