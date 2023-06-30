#include <bits/stdc++.h>
using namespace std;
// void nextPermutation(vector<int> &nums)
// {
//     // nusm[i-1]<nums[i]
//     int n = nums.size();
//     int gola = -1;
//     for (int i = n - 1; i > 0; i--)
//     {
//         if (nums[i] > nums[i - 1])
//         {
//             gola = i - 1;
//             break;
//         }
//     }
//     if (gola != -1)
//     {
//         int swap_index = gola;
//         for (int j = n-1; j >= gola + 1; j--)
//         {
//             if (nums[j] > nums[gola])
//             {
//                 swap_index = j;
//                 break;
//             }
//         }
//         swap(nums[gola], nums[swap_index]);
//     }

//     reverse(nums.begin() + gola + 1, nums.end());
// }
vector<int> nextPermutation(vector<int> a)
{
    // code here
    int n = a.size();
    int minFromRight = -1;
    for (int i = n - 1; i > 0; i--)
    {
        if (a[i] > a[i - 1])
        {
            minFromRight = i - 1;
            break;
        }
    }
    if (minFromRight != -1)
    {
        int swapIndex = minFromRight;
        for (int i = n - 1; i >= minFromRight; i--)
        {
            if (a[i] > a[minFromRight])
            {
                swapIndex = i;
                break;
            }
        }
        swap(a[minFromRight], a[swapIndex]);
    }
    reverse(a.begin() + minFromRight + 1, a.end());
    return a;
}
int main()
{
    vector<int> nums = { 3, 1};
    vector<int> ans = nextPermutation(nums);
    string ans="";
    for (int i=0;i<ans.size();i++ )
    {
        cout << ans[i] << " ";
    }

    return 0;
}