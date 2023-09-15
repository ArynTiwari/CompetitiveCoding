package InterviewBit.BinarySearch;

public class SearchInRotatedSortd {
    static int bSearch(int[] a) {
        return -1;
    }

    static int search(int[] a, int val) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (a[mid] > a[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int[] a = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.println(search(a, 0));
    }
}
