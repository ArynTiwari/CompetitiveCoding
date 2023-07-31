#include <bits/stdc++.h>
using namespace std;
int longestSubarray(vector<int> &nums)
{
    int n = nums.size();
    int i = 0, size = 0;
    int lastZero = -1;
    for (int j = 0; j < n; j++)
    {

        if (nums[j] == 0)
        {
            i = lastZero + 1;
            lastZero = j;
            // cout << "Last zero found at" << lastZero << endl;
        }
        size = max(size, j - i);
    }

    return size;
}
int main()
{
    vector<int> nums = {0, 1, 1, 1, 0, 1, 1, 0};
    cout << longestSubarray(nums) << endl;
    return 0;
}