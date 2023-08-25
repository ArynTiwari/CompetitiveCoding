package LeetCode.Strings;

public class VovelConvert {
    public static int minCost(String s) {
        int minCost = 0;
        int vowelCount = 0;

        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                minCost += 10;
            } else {
                vowelCount++;
            }
        }

        if (vowelCount == 0) {
            return -1; // No vowels, return -1 as per your requirement
        }

        minCost += (vowelCount - 1) * 5; // Cost for changing vowels to vowels

        return minCost;
    }

    public static void main(String[] args) {
        String s = "grieybaou";
        System.out.println(minCost(s));
    }
}
