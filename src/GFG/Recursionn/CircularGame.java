package GFG.Recursionn;

public class CircularGame {
    static int circle(int n, int k){
        if(n==1){
            return 0;
        }
        return (circle(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        int n=5,k=2;
        System.out.println(circle(n, k)+1);
    }
}
 