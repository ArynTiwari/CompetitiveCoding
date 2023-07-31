#include <bits/stdc++.h>
using namespace std;
int threeSumClosest(vector<int> &nums, int target)
{
    int n = nums.size();
    int sol = INT_MAX;
    sort(begin(nums), end(nums));
    for (int i = 0; i <=n-3; i++)
    {
        int j = i + 1, k = n - 1;
        while (j < k)
        {
            int sum = nums[i] + nums[j] + nums[k];
            if (abs(sum - target) < abs(target - sol))
            {
                sol = sum;
            }
            if (sum < target)
            {
                j++;
            }
            else
            {
                k--;
            }
        }
    }

    return sol;
}
int main()
{
    vector<int> nums = {-1, 6, 1, -4};
    cout<<threeSumClosest(nums, 1)<<endl;
    return 0;
}