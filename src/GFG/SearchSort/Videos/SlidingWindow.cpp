#include<bits/stdc++.h>
using namespace std;
//two sum on sorted array
//hashing is required for unsorted array
vector<int> twoSum(vector<int> &numbers, int target)
{
    int l=0, r= numbers.size()-1;
    while (l<r)
    {
        if(numbers[l]+numbers[r] == target){
            return {l,r};
        }
        else if (numbers[l] + numbers[r] < target){
            l++;
        }
        else{
            r--;
        }
    }
    return {};
    
}
int main()
{
    return 0;
}