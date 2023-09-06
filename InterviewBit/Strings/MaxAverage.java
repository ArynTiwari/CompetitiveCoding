package InterviewBit.Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxAverage {
    public static int highestScore(String[][] s) {
        int maxAvg = 0;
        HashMap<String, Integer> mp = new HashMap<>();
        HashMap<String, Integer> mpp = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            String name = s[i][0];
            int marks = Integer.parseInt(s[i][1]);
            if (mp.containsKey(name)) {
                int prev = mp.get(name);
                // System.out.println(name + " " + prev);
                int push = (prev + marks);
                mp.put(name, push);

            } else {
                mp.put(name, marks);
            }

        }
        for (int i = 0; i < s.length; i++) {
            String name = s[i][0];
            if (mpp.containsKey(name)) {
                mpp.put(name, mpp.get(name) + 1);
            } else {
                mpp.put(name, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String key = entry.getKey();
            int occur = mpp.get(key);
            int totalMarks = entry.getValue();
            int actual = totalMarks / occur;
            if (actual > maxAvg) {
                maxAvg = actual;
            }
        }
        return maxAvg;
    }

    public static void main(String[] args) {
        String[][] A = {

                { "kqu", "90" },
                { "qkcb", "10" },
                { "qkcb", "68" },
                { "kqu", "89" },
                { "kqu", "32" },
                { "qkcb", "28" },
                { "qkcb", "63" },
                { "kqu", "90" },
                { "kqu", "47" },

        };
        System.out.println("Max value is -> " + highestScore(A));
    }
}
