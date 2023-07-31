#include <bits/stdc++.h>
using namespace std;
int pivotEle(int arr[], int n)
{
    int l = 0, r = n - 1;
    while (l < r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] > arr[r])
        {
            l = mid + 1;
        }
        else
        {
            r = mid ;
        }
    }
    return r;
}
int binarySearch(int arr[], int n, int l, int r, int target)
{
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == target)
        {
            return mid;
        }
        else if (arr[mid] > target)
        {
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return -1;
}
int serchInRotated(int arr[], int n, int target)
{
    int pivot = pivotEle(arr, n);
    int a = binarySearch(arr, n, 0, pivot - 1, target);
    int b = binarySearch(arr, n, pivot, n - 1, target);
    cout<<pivot<<" "<<a<<" "<<b<<endl;
    if (a != -1)
    {
        return a;
    }
    if (b != -1)
    {
        return b;
    }
    return -1;
}
int main()
{
    int n = 5;
    int arr[n] = {4, 5, 1, 2, 3};
    cout << serchInRotated(arr, n, 2)<<endl;
    return 0;
}