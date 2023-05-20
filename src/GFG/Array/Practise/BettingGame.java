package GFG.Array.Practise;

public class BettingGame {
    static int betBalance(String result) {
        // code here
        int balance = 4, bet = 1;
        for (int i = 0; i < result.length(); i++) {
            if (balance < bet) {
                return -1;
            }
            if (result.charAt(i) == 'W') {
                balance = balance + bet;
                bet = 1;
            } else if (result.charAt(i) == 'L') {
                balance = balance - bet;
                bet = 2 * bet;
            }

        }
        
        return balance;
    }

    public static void main(String[] args) {
        String str = "LW";
        System.out.println(betBalance(str));
    }
}
