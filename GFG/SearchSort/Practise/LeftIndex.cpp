#include <bits/stdc++.h>
using namespace std;
int leftIndex(int N, int arr[], int x)
{

    // Your code here
    int l = 0, r = N - 1;
    int left = -1;
    while (l <= r)
    {
        int mid= l+(r-l)/2;
        if(arr[mid]==x){
            left = mid;
            r = mid-1;
        }
        else if(arr[mid]>x){
            r = mid-1;
        }
        else{
            l = mid+1;
        }

    }
    return left;
}
int main()
{
    int N = 10;
    int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
    int x = 5;
    cout<<leftIndex(N,arr,x);
    cout<<endl;
    return 0;
}