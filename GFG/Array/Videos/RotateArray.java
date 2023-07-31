package GFG.Array.Videos;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rt = new RotateArray();
        String s = "abcde", goal = "cdeab";
        if(rt.rotateString(s, goal)){
            System.out.println("True");
        }

    }

    void rotate(int arr[]) {
        int n = arr.length;

        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }

    }

    boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.substring(1)).append(s.charAt(0));
            s = sb.toString();
            if (s.equals(goal)) return true;
            sb.setLength(0);
        }
        return false;
    }
    boolean rtSt(String s, String goal){
        
        return false;
    }
}
