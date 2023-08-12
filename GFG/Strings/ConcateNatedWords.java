package GFG.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcateNatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        /**
         * Divide the word in prefix and suffix
         * {cat,dog,catdog}-> prefix:-> cat,suffix:->dog
         * if(set.contains(prefix) && set.constins(suffix) || check(suffix)) ans =>
         * pre+suff
         */
        final Set<String> dict = new HashSet<>(Arrays.asList(words));
        final List<String> answer = new ArrayList<>();
        for (final String word : words) {
            final int length = word.length();
            final boolean[] dp = new boolean[length + 1];
            dp[0] = true;
            for (int i = 1; i <= length; ++i) {
                for (int j = (i == length ? 1 : 0); !dp[i] && j < i; ++j) {
                    dp[i] = dp[j] && dict.contains(word.substring(j, i));
                }
            }
            if (dp[length]) {
                answer.add(word);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
