package Algos.SlidingWindow;

public class MaxConfusionExam {
    public static int maxConsecutiveAnswers(String s, int k) {
        int i = 0, j = 0, ans = 0, countF = 0, countT = 0;
        while (j < s.length()) {
            if (s.charAt(j) == 'F') {
                countF += 1;
            }
            if (s.charAt(j) == 'T') {
                countT += 1;
            }
            int min = Math.min(countF, countT);
            while (min > k) {
                if (s.charAt(i) == 'F') {
                    countF -= 1;
                } else {
                    countT -= 1;
                }
                min = Math.min(countF, countT);
                i++;
            }

            ans = Math.max(j - i + 1, ans);
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "TTFTTFTF";
        System.out.println(maxConsecutiveAnswers(s, 1));
    }
}
