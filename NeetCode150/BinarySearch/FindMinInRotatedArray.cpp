#include<bits/stdc++.h>
using namespace std;
int minRotated(int arr[],int n){
    int l = 0, r = n-1;
    while(l<r){
        int mid = l +(r-l)/2;
        if(arr[mid]>arr[r]){
            l = mid+1;
        }
        else{
            r = mid;
        }
    }
    return arr[r];
}
int main()
{
    int n= 5;
    int arr[n]={4,5,1,2,3};
    cout<<minRotated(arr,n);
    return 0;
}