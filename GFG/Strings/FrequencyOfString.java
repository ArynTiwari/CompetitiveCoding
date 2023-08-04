package GFG.Strings;

/**
 * String class produces immutable clas
 * StringBuffer is thread safe(used when multiple threads are used)
 * StringBuilder is not thread safe(used when single thread is used)
 * When we use literals, new memory is not created.When we use new String,new
 * memory is allocated- String Literal Pool
 * 
 */
public class FrequencyOfString {
    static void count(String str) {
        str = str.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "HelloIamAryan";
        // String str2 ="HelloIamAryan";
        System.out.println(str.indexOf("I"));
    }
}
