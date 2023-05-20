package LeetCode.Arrays.Medium;
;

public class GoodPairs {
    public static int numIdenticalPairs(int[] a) {
        int count = 0;
        int[] freq = new int[101];
        for (int i : a) {
            count +=freq[i]++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
