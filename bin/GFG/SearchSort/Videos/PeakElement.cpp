#include<bits/stdc++.h>
using namespace std;
int peakElement(vector<int> a){
    int n = a.size();
    int l=0, r = n-1;
    while(l<=r){
        int mid = l+(r-l)/2;
        if((mid==0 || a[mid-1]<=a[mid])&&(mid== n-1 || a[mid+1]<=a[mid])){
            return mid;
        }
        else if(mid >0 && a[mid-1] >= a[mid]){
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
    vector<int>a = {5,10,100,40,60,70,80};
    cout<<peakElement(a)<<endl;
    return 0;
}