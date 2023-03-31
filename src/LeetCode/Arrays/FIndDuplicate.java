package LeetCode.Arrays;

//no solution found without using HashSet 
//we can use cycle-detection problem for findig the duplicate without using hashing

public class FIndDuplicate {
    static boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    static void findDuplicate(int[] arr){
        int slow=arr[0],fast=arr[arr[0]];
        while (slow!=fast) {
            slow=arr[slow];
            fast= arr[arr[fast]];
        }
        fast=0;
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        System.out.println(slow);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3 };
        // System.out.println(containsDuplicate(arr));
        findDuplicate(arr);

    }
}
