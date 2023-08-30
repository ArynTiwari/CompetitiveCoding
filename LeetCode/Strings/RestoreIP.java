package LeetCode.Strings;

import java.util.ArrayList;
import java.util.List;

public class RestoreIP {
    int n;
    List<String> result;

    public boolean isValid(String s) {

        if (s.charAt(0) == '0')
            return false;

        if (Integer.parseInt(s) > 255)
            return false;
        return true;

    }

    public void solve(String s, int i, int parts, String cur) {
        if (parts > 4)
            return;
        if (parts == 4 && i == n) {
            result.add(cur.substring(0, cur.length() - 1));
            return;
        }

        if (i + 1 <= n)
            solve(s, i + 1, parts + 1, cur + s.substring(i, i + 1) + ".");

        if (i + 2 <= n && isValid(s.substring(i, i + 2)))
            solve(s, i + 2, parts + 1, cur + s.substring(i, i + 2) + ".");

        if (i + 3 <= n && isValid(s.substring(i, i + 3)))
            solve(s, i + 3, parts + 1, cur + s.substring(i, i + 3) + ".");

    }

    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        result = new ArrayList<>();
        result.clear();

        if (n > 12)
            return result;

        int parts = 0;
        String cur = "";

        solve(s, 0, parts, cur);
        return result;

    }
}
