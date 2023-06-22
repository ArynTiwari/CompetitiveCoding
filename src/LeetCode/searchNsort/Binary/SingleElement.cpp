#include <bits/stdc++.h>
using namespace std;
// simple approach is XOR all elements
// O(log n) can be achieved with Binary Search
int singleNonDuplicate(vector<int> &nums)
{
    int n = nums.size();
    int l = 0, r = n - 1, ans = -1;
    while (l < r)
    {
        int mid = l + (r - l) / 2;
        if (nums[mid] == nums[mid + 1])
        {
            if ((n - mid) % 2 == 0)
            {
                l = mid + 2;
            }
            else
            {
                r = mid - 1;
            }
        }
        else
        {
            if ((n - mid) % 2 == 0)
            {
                r = mid;
            }
            else
            {
                l= mid+1;
            }
        }
    }
    return nums[r];
}
int main()
{
    cout<<(2-1)%2;
    return 0;
}