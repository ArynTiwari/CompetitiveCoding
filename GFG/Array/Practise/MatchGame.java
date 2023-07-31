package GFG.Array.Practise;

public class MatchGame {
    static int matchGame(int N) {
        if (N <= 4) {
            return N;
        } else if (N % 5 == 0) {
            return -1;
        }

        return N % 5;
    }

    public static void main(String[] args) {
        System.out.println(matchGame(21));
    }
}
