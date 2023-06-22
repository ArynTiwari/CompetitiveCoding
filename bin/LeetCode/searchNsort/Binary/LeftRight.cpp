#include <bits/stdc++.h>
using namespace std;
int leftOccur(int arr[], int n, int x)
{
    int l = 0, r = n - 1;
    int left = -1;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
        {
            left = mid;
            r = mid - 1;
        }
        else if (arr[mid] > x)
        {
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return left;
}
int rightOccur(int arr[],int n, int x){
    int l=0, r= n-1, right = -1;
    while(l<=r){
        int mid=  l+(r-l)/2;
        if(arr[mid]==x){
            right = mid;
            l = mid+1;
        }
        else if(arr[mid]>x){
            r = mid-1;
        }
        else{
            l = mid+1;
        }
    }
    return right;
}
int main()
{
    int n=5;
    int arr[n]={1,2,3,4,4,5};
    cout<<leftOccur(arr,n,4)<<" "<<rightOccur(arr,n,4)<<endl;
    return 0;
}