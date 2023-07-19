#include <bits/stdc++.h>
using namespace std;
int main()
{
    vector<vector<int>> arr = {{1, 2, 3, 4},
                               {5, 6, 7, 8},
                               {9, 10, 11, 12},
                               {13, 14, 15, 16}};
    int m = arr.size();
    int n = arr[0].size();
    for (int i = 0; i < n; i++)
    {
        int l = 0, r = m - 1;
        while (l <= r)
        {
            swap(arr[l][i], arr[r][i]);
            l++;
            r--;
        }
    }

    return 0;
}