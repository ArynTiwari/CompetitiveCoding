#include <bits/stdc++.h>
using namespace std;
static int findFloor(long arr[], int n, long x)
{
    int l = 0, r = n - 1;
    int ans = -1;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
        {
            return mid;
        }
        else if (arr[mid] > x)
        {
            r = mid - 1;
        }
        else
        {
            ans = mid;
            l = mid + 1;
        }
    }
    return ans;
}
int main()
{
    int N = 7, x = 9;
    long arr[] = {1, 2, 8, 10, 11, 12, 19};
    cout<<findFloor(arr,N,x);
    return 0;
}