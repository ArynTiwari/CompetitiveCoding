#include <bits/stdc++.h>
using namespace std;
int missingNumber(int arr[], int n)
{
    sort(arr, arr + n);
    int num = 1;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == num)
            num++;
    }
    return num;
}
int firstMissingPositive(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n; ++i)
        while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i])
            swap(arr[i], arr[arr[i] - 1]);

    for (int i = 0; i < n; ++i)
        if (arr[i] != i + 1)
            return i + 1;

    return n + 1;
}
int main()
{
    int n = 4;
    vector<int> arr = {1};
    cout << firstMissingPositive(arr) << endl;
    return 0;
}