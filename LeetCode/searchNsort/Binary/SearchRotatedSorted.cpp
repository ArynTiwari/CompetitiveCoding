#include <bits/stdc++.h>
using namespace std;
int bSearch(vector<int> &nums, int l, int h, int target)
{
    while (l <= h)
    {
        int mid = l + (h - l) / 2;
        if (nums[mid] == target)
        {
            return mid;
        }
        else if (nums[mid] > target)
        {
            h = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return -1;
}
bool search(vector<int> &nums, int target)
{
    int l = 0, r = nums.size() - 1;
    while (l < r && nums[l] == nums[l + 1])
    {
        l++;
    }
    while (l < r && nums[r] == nums[r - 1])
    {
        r--;
    }

    while (l < r)
    {
        int mid = l + (r - l) / 2;
        if (nums[mid] > nums[r])
        {
            l = mid + 1;
        }
        else
        {
            r = mid;
        }
    }
    int a = bSearch(nums, 0, r - 1, target);
    int b = bSearch(nums, r, nums.size() - 1, target);
    if (a != -1)
    {
        return a;
    }
    return b;
}
int main()
{
    
    return 0;
}