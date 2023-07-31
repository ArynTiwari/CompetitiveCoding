package LeetCode.searchNsort.Binary;

class MinNumHours {
    public static int isPossible(int[] dist, double hour) {
        int time = 0, len = dist.length;
        for (int i = 0; i < len - 1; i++) {
            time += Math.ceil(dist[i] / hour);
        }
        time += dist[len - 1] / hour;
        return time;
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        int result = -1;
        int l = 0, r = (int) Math.pow(10, 7);
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isPossible(dist, mid) <= hour) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] dist = { 1, 3, 2 };
        double hour = 2.7;
        System.out.println(minSpeedOnTime(dist, hour));
    }
}