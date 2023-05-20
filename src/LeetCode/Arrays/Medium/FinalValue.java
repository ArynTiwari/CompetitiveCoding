package LeetCode.Arrays.Medium;
;

public class FinalValue {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations)
            if (s.charAt(1) == '-')
                x--;
            else
                x++;
        return x;
    }

    public static void main(String[] args) {
        String[] name = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(name));
    }
}
