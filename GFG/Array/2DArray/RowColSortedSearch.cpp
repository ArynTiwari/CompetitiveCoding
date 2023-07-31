#include <bits/stdc++.h>
using namespace std;
bool search(vector<vector<int>> a, int m, int n, int x)
{
    int l = 0, r = n - 1;
    while (l < m && r >= 0)
    {
        int element = a[l][r];
        if (element == x)
        {
            return true;
        }
        else if (element > x)
        {
            r--;
        }
        else
        {
            l++;
        }
    }
    return false;
}
int main()
{
    vector<vector<int>> arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    cout << search(arr, arr.size(), arr[0].size(), 50);
    cout << arr[0][0] << endl;
    return 0;
}