package GFG.Array.Videos;

public class SubarrayGivenSum {
    static void subarray(int[] arr, int sum) {
        int start = 0, curr = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            curr = curr + arr[i];
            while (sum < curr) {
                curr -= arr[start];
                start++;
            }
            if (curr == sum) {
                flag = true;
                System.out.println(arr[i]);
                System.out.println(curr);
            }
        }
        if (flag == false) {
            System.out.println("Not found!");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 20, 3, 10, 5 };
        subarray(arr, 24);
    }
}
