package LeetCode.Strings;

public class StringCompress {
    public static int compress(char[] chars) {
        int index = 0, i = 0;
        int n = chars.length;
        while (i < n) {
            char curr = chars[i];
            int count = 0;
            while (i < n && chars[i] == curr) {
                count++;
                i++;
            }
            chars[index++] = curr;
            if (count > 1) {
                String count_str = "";
                count_str += count;
                char[] count_arr = count_str.toCharArray();
                for (char ch : count_arr) {
                    chars[index++] = ch;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        int ans = compress(chars);
        System.out.println(ans);
    }
}
