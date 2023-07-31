package GFG.Array.Videos;

public class MinimumFlips {
    static void tellCount(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                //to check if we need to filp the element or not
                if (arr[i] != arr[0]) {
                    System.out.print("From index " + i + " to ");
                } else {
                    //print i-1 ony if it is the end to the group  that neeeds to be flipped!
                    System.out.println(i - 1);
                }

            }

        }//to handel the last element 
        if (arr[n - 1] != arr[0]) {
            System.out.println(n - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 0, 0, 1, 1, 0, 1 };
        tellCount(arr);
    }
}
