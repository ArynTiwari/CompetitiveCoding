package LeetCode.Strings;

public class Palindrome {
    static void palindrome(String str){
        int low=0, high = str.length()-1;
        boolean flag=true;
        while (low<=high) {
            if(str.charAt(low) != str.charAt(high)){
                System.out.println("Not palindrome");
                flag = false;
            }
            low++;high--;
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static void main(String[] args) {
        String str = "A21A";
        palindrome(str);
    }
}
