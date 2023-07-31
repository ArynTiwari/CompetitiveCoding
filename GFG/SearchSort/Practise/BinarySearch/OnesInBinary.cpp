#include <bits/stdc++.h>

using namespace std;
int leftOccur(int arr[], int n)
{
    int l = 0, r = n - 1;
    int left = -1;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == 1)
        {
            left = mid;
            r = mid - 1;
        }
        else if (arr[mid] < 1)
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
int rightOccur(int arr[], int n)
{
    int l = 0, r = n - 1;
    int right = -1;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == 1)
        {
            right = mid;
            l = mid + 1;
        }
        else if (arr[mid] < 1)
        {
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return right;
}
int countOnes(int arr[], int N)
{
    int a = leftOccur(arr, N);
    int b = rightOccur(arr, N);
    if (a == -1)
    {
        return 0;
    }
    cout << a << " " << b << endl;
    return (b - a) + 1;
}
int main()
{
    int N = 5;
    int arr[] = {0, 0, 0, 0, 0};
    cout << countOnes(arr, N);
    cout << endl;
    return 0;
}