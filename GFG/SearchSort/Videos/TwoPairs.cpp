#include <bits/stdc++.h>
using namespace std;
// vector<int> twoSum(vector<int> &nums, int target)
// {
//     int n = nums.size();
//     int l = 0, r = n - 1;
//     while (l < r)
//     {
//         if (nums[l] + nums[r] == target)
//         {
//             return {l, r};
//         }
//         else if (nums[l] + nums[r] < target)
//         {
//             l += 1;
//         }
//         else
//         {
//             r -= 1;
//         }
//     }
//     return {-1, -1};
// }
vector<int> twoSum(vector<int> &nums, int target)
{
    int n = nums.size();
    unordered_map<int, int> mp;
    for(int i=0;i<n;i++){
        int tar = target-nums[i];
        if(mp.find(tar) == mp.end()){
            mp[nums[i]]=i;
        }
        else{
            return {mp[tar],i};
        }
    }
    

    return {-1, -1};
}
int main()
{
    vector<int> vec = {2, 3, 8, 11};
    vector<int> ans = twoSum(vec, 14);
    for (auto v : ans)
    {
        cout << v << " ";
    }
    cout<<endl;
    return 0;
}