package LeetCode.searchNsort;

import java.util.Arrays;

public class SpellPotion {
    public static int lower_bound(int l, int r, int[] pos, long target) {
        int count = 0, mid = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (pos[mid] >= target) {
                count = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return count;
    }

    public static int lb(int[] a, int x) {
        int lb = Arrays.binarySearch(a, x);
        if (lb < 0) {
            lb = Math.abs(lb) - 1;
        }

        else {
            int y = a[lb];
            for (int i = lb - 1; i >= 0; i--) {
                if (a[i] == y)
                    --lb;
                else
                    break;
            }
        }
        return lb;
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] ans = new int[n];
        Arrays.sort(potions);
        long maxPotion = potions[m - 1];
        for (int i = 0; i < n; i++) {
            int spl = spells[i];
            long minpotion = (long) Math.ceil((1.0 * success) / spl);

            if (minpotion > maxPotion) {
                ans[i] = 0;
                continue;
            }
            int indx = lower_bound(0, m - 1, potions, minpotion);

            int count = m - indx;
            ans[i] = count;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] spells = { 5, 1, 3 };
        int[] potions = { 1, 2, 3, 4, 5 };
        int success = 7;
        int[] ans = successfulPairs(spells, potions, success);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
