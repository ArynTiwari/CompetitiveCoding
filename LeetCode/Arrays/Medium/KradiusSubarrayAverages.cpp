#include <bits/stdc++.h>
using namespace std;
// prefix sum
vector<int> getAverages(vector<int> &nums, int k)
{
    int n = nums.size();
    int size = 2 * k + 1;
    vector<int> ans(n, -1);

    if (n < size)
    {
        return ans;
    }

    vector<long long> prefixSum(n + 1);
    for (int i = 0; i < n; ++i)
    {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }

    for (int i = k; i + k < n; ++i)
    {
        ans[i] = (prefixSum[i + k + 1] - prefixSum[i - k]) / size;
    }

    return ans;
}
// silding window; when we travel in overlapping window
/*
    Main point in sw: pehle window ka sum calculate krlo, fir left se delete and right se add
    1. i would start from k as all elements before have less elements than k.Similarly for right side i.e i<= n-k-1
    2. find sum for the window
    3. while right< n keep running the while loop
    4. new = nums[right] old = nums[left] sum = (window+new-old)
*/

vector<int> getAvg(vector<int> &nums, int k)
{
    int n = nums.size();
    int left = 0, right = 2 * k, count = 2 * k + 1;
    long long window_sum = 0;
    vector<int> ans(n, -1);
    if (k == 0)
    {
        return nums;
    }
    if (n < 2 * k + 1)
    {
        return ans;
    }
    for (int i = left; i <= right; i++)
    {
        window_sum += nums[i];
    }
    int i = k;
    ans[i] = window_sum / count;
    i++;
    right++;
    while (right < n)
    {
        int old = nums[left];
        int neww = nums[right];
        window_sum = window_sum + neww - old;
        ans[i] = window_sum / count;
        left++;
        right++;
        i++;
    }

    return ans;
}
int main()
{
    return 0;
}