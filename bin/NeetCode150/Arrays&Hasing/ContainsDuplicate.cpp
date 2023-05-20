#include<bits/stdc++.h>
using namespace std;
bool containsDuplicate(vector<int> &nums)
{
    sort(begin(nums), end(nums));
    for (int i = 1; i < nums.size(); i++)
    {
        if (nums[i] == nums[i - 1])
        {
            return true;
        }
    }
    return false;
}
int main()
{
    vector<int>nums={1,2,3,5,1,1,1,};
    if(containsDuplicate(nums)){
        cout<<"Yes"<<endl;
    }
    else{
        cout<<"No"<<endl;
    }
    return 0;
}