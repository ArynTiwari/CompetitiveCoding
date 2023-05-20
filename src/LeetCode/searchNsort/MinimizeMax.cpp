#include <bits/stdc++.h>
using namespace std;

bool valid(vector<int> &nums, long mid, int n)
{
    vector<long long> vec(begin(nums), end(nums));
    for (int i = 0; i < n - 1; i++)
    {
        if (vec[i] > mid)
        {
            return false;
        }
        long long buffer = mid - vec[i];
        vec[i + 1] = vec[i + 1] - buffer;
    }
    return vec[n - 1] <= mid;
}
int minimizeArrayValue(vector<int> &nums)
{
    int n = nums.size(), result = 0;
    int l = 0, r = *max_element(begin(nums), end(nums));
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (valid(nums, mid, n))
        {
            result = mid;
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return result;
}
int main()
{
    vector<int> nums = {3, 7, 1, 6};
    cout << minimizeArrayValue(nums) << endl;
    return 0;
}