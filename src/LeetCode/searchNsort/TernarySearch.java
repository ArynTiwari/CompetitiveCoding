package LeetCode.searchNsort;

//applied to sorted arrays, similar to binary search but divides the array into three parts (equal)
// divide the array in three parts by taking two mid ;
// mid1 = l + (r-l)/3 and mid2 = 
//
public class TernarySearch {
    public static int ternay(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (r >= l) {

            // Find mid1 and mid2
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            // Check if target is present at any mid
            if (a[mid1] == target) {
                return mid1;
            }
            if (a[mid2] == target) {
                return mid2;
            }

            // Since target is not present at mid,
            // check in which region it is present
            // then repeat the Search operation
            // in that region

            if (target < a[mid1]) {

                // The target lies in between l and mid1
                r = mid1 - 1;
            } else if (target > a[mid2]) {

                // The target lies in between mid2 and r
                l = mid2 + 1;
            } else {

                // The target lies in between mid1 and mid2
                l = mid1 + 1;
                r = mid2 - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(ternay(a, 10));
    }
}
