package LeetCode.Arrays.Medium;


import java.util.ArrayList;
import java.util.List;

public class KidWithMostCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {

            max = Math.max(candies[i], max);

        }
        for (int i = 0; i < candies.length; i++) {
            list.add(candies[i] + extraCandies >= max);
        }
        // for (int index = 0; index < candies.length; index++) {
        //     candies[index] = extraCandies + candies[index];
        // }
        // for (int i = 0; i < candies.length; i++) {
        //     if (candies[i] >= max) {
        //         list.add(true);
        //     } else {
        //         list.add(false);
        //     }
        // }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {  4, 2, 1, 1, 2};
        int extra = 1;
        List<Boolean> lis = kidsWithCandies(a, extra);
        for (int i = 0; i < lis.size(); i++) {
            System.out.println(lis.get(i));
        }
    }
}
