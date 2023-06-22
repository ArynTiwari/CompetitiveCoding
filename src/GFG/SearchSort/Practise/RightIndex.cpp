#include<bits/stdc++.h>
using namespace std;
int righIndex(int arr[],int n,int x){
    int l=0, r = n-1;
    int right = -1;
    while(l<=r){
        int mid = l+(r-l)/2;
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
    int n = 10;
    int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
    int x = 2;
    cout<<righIndex(arr,n,x);
    cout<<endl;
    return 0;
}