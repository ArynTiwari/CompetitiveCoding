package InterviewBit.Strings;

import java.util.ArrayList;
import java.util.List;

public class ValidIp {
    public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> result = new ArrayList<>();
        generateIPAddresses(s, 0, 0, new StringBuilder(), result);
        return result;
    }

    private void generateIPAddresses(String s, int start, int segmentCount, StringBuilder current,
            List<String> result) {
        if (segmentCount > 4) {
            return;
        }
        if (start == s.length() && segmentCount == 4) {
            result.add(current.toString());
            return;
        }

        for (int len = 1; len <= 3; len++) {
            if (start + len > s.length()) {
                break;
            }
            String segment = s.substring(start, start + len);
            if ((segment.length() > 1 && segment.startsWith("0")) || (len == 3 && Integer.parseInt(segment) > 255)) {
                continue;
            }
            String separator = segmentCount == 0 ? "" : ".";
            generateIPAddresses(s, start + len, segmentCount + 1,
                    new StringBuilder(current).append(separator).append(segment), result);
        }
    }

    public static void main(String[] args) {
        ValidIp solution = new ValidIp();
        String input = "25525511135";
        List<String> result = solution.restoreIpAddresses(input);
        System.out.println(result);
    }
}
