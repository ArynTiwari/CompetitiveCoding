package InterviewBit.BinarySearch;

public class FirstLast {
    static int bL(int[] a, int b) {
        int ans = -1, l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == b) {
                ans = mid;
                r = mid - 1;
            } else if (a[mid] > b) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static int bR(int[] a, int b) {
        int ans = -1, l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == b) {
                ans = mid;
                l = mid + 1;
            } else if (a[mid] > b) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static int[] firsLast(int[] a, int b) {
        int[] ans = new int[2];
        int l = bL(a, b);
        int r = bR(a, b);
        ans[0] = l;
        ans[1] = r;
        System.out.println(ans[0] + " " + ans[1]);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 5, 9 };
        System.out.println(firsLast(a, 5));
    }
}
