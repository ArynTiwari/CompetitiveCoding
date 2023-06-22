#include<bits/stdc++.h>
using namespace std;
int search(int a[],int n,int target){
    int l=0, r= n-1;
    while(l<=r){
        int mid= l+(r-l)/2;
        if(a[mid]==target){
            return mid;
        }
        else if(a[mid]>target){
            r = mid-1;
        }
        else{
            l = mid+1;
        }
    }
    return -1;
}
int main()
{
    return 0;
}