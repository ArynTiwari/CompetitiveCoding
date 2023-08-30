package GFG.Strings;

class ReverseWords {
    static String reverse(String s) {
        StringBuilder ans = new StringBuilder();
        String[] ss = s.split("\\s+");
        for (String sss : ss) {
            System.out.println(sss);
            ans.insert(0, " ").insert(0, sss);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "  Hello I am Aryan  ";
        System.out.print(reverse(s));
    }
}