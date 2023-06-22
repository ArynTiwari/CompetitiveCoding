#include <bits/stdc++.h>
using namespace std;
long long int floorSqrt(long long int x)
{
    // Your code goes here
    long long ans= -1;
    long long l = 1, r = x;
    while(l<=r){
        long long mid = l+(r-l)/2;
        long long sqr = mid*mid;
        if(sqr ==x){
            return mid;
        }
        else if(sqr>x){
            r = mid-1;
        }
        else{
            l = mid+1;
            ans = mid;
        }
    }
    return ans;
}
int main()
{
    cout<<floorSqrt(6)<<endl;
    return 0;
}