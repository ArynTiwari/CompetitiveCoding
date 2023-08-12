package GFG.Strings;

import java.util.*;

//shuru ke "k" chars me se koi bhi ek 
//choose krke peche daldo 
public class OrderlyQueue {
    public String orderlyQueue(String s, int k) {
        /**
         * Brute force
         * har char ko ek bar choose krke new string banate jao
         */

        /*
         * Optamised
         * koi bhi 2 char ko chosse kro aur swap kro
         * aisa krne se string swap hojaega
         * k==1 -> brute force laga do
         * k>1 -> sort and return
         */
        if (k > 1) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            return new String(temp);

        }
        String res = s;
        for (int l = 1; l <= s.length() - 1; l++) {
            String temp = s.substring(l) + s.substring(0, l);
            if (temp.compareTo(res) < 0) {
                res = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
