package GFG.Array.Videos;

public class SubArraySum {
    static void printSub(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    if(arr[j2] == 0){
                        count++;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("The count is"+count);
    }

    static int maxSub(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                maxSum = Math.max(maxSum, curr);
            }
        }
        return maxSum;
    }

    static int optmMaxSub(int[] arr) {
        int res = arr[0], maxEnd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(maxEnd, res);
        }
        return res;
    }
    static int kadanes(int[] arr){
        int sum=0;
        int maxE=arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            maxE = Math.max(maxE, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxE;
    }
    static int maxLen(int[] arr) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + arr[i + 1] == 0) {
                len = Math.max(len, i);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        // printSub(arr);
        System.out.println(optmMaxSub(arr));
    }
}
