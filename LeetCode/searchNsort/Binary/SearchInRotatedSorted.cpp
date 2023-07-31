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
int search(vector<int> &nums, int target)
{
    int l = 0, h = nums.size() - 1;
    while (l < h)
    {
        int mid = l + (h - l) / 2;
        if (nums[mid] > nums[h])
        {
            l = mid + 1;
        }
        else
        {
            h = mid;
        }
    }
    int a = bSearch(nums, 0, h - 1, target);
    int b = bSearch(nums, h, nums.size() - 1, target);
    if(a != -1){
        return a;
    }
    return b;
}
int main()
{
    vector<int> nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    int arr[] =  {1,2,3,4};
    cout << search(nums, target);
    return 0;
}