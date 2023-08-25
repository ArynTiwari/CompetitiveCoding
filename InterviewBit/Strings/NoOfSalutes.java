package InterviewBit.Strings;

public class NoOfSalutes {
    public static long countSalutes(String s) {
        long ans = 0;
        long count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '<') {
                count++;
            } else {
                ans += count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = ">>><<<";
        System.out.println(countSalutes(s));
    }
}
