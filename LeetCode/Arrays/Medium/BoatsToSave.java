package LeetCode.Arrays.Medium;

import java.util.Arrays;

public class BoatsToSave {

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int bot = 0;
        int l = 0, r = people.length - 1;
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
                r--;
            } else {
                r--;
            }
            bot++;
        }
        return bot;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 2, 1 };
        System.out.println(numRescueBoats(a, 3));
    }
}
