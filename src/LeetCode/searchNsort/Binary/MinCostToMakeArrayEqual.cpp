#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
long long costHelper(vector<int> &nums, vector<int> &cost, ll element)
{
    ll totalCost = 0;
    for (size_t i = 0; i < nums.size(); i++)
    {
        ll diff = nums[i] - element;
        totalCost += abs(diff) * cost[i];
    }
    return totalCost;
}
long long minCost(vector<int> &nums, vector<int> &cost)
{
    ll ans = INT_MAX;
    int l = *min_element(begin(nums), end(nums));
    int r = *max_element(begin(nums), end(nums));
    while (l < r)
    {
        ll mid = l + (r - l) / 2;
        ll costOfMid = costHelper(nums, cost, mid);
        ll costOfMid1 = costHelper(nums, cost, (mid + 1));
        ans = min(costOfMid, costOfMid1);
        if (costOfMid > costOfMid1)
        {
            l = mid + 1;
        }
        else
        {
            r = mid - 1;
        }
    }
    return ans;
}
int main()
{
    vector<int> nums = {1, 3, 5, 2};
    vector<int> cost = {2, 3, 1, 14};
    int x = minCost(nums, cost);
    cout << "Overall minimum cost is:- " << x;
    return 0;
}