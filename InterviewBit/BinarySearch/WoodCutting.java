package InterviewBit.BinarySearch;

class WoodCutting {
    public static int solve(int[] heights, int B) {
        int left = 0;
        int right = getMaxHeight(heights); // Initialize the right boundary as the maximum height in the array

        while (left < right) {
            int mid = left + (right - left + 1) / 2; // Calculate the middle height

            if (canCut(heights, B, mid)) {
                left = mid; // Move the left boundary to the middle if it's possible to cut at least B
                            // meters
            } else {
                right = mid - 1; // Otherwise, move the right boundary to the middle - 1
            }
        }

        return left;
    }

    private static boolean canCut(int[] heights, int B, int height) {
        long totalCut = 0; // Use a long to avoid integer overflow
        for (int h : heights) {
            if (h > height) {
                totalCut += h - height; // Add the amount that can be cut from this tree
            }
        }
        return totalCut >= B; // Check if the total cut is at least B meters
    }

    private static int getMaxHeight(int[] heights) {
        int max = 0;
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = { 117, 84, 50, 119, 74, 128 };
        int b = 58;
        System.out.println(" ");
        System.out.println(solve(a, b));

    }
}
