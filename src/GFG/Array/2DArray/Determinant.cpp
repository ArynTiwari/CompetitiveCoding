#include <bits/stdc++.h>
using namespace std;
int determinantOfMatrix(vector<vector<int>> a, int n)
{
    // code here
    if (n == 1)
        return a[0][0];
    if (n == 2)
    {
        return a[0][0] * a[1][1] - a[1][0] * a[0][1];
    }

    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        vector<vector<int>> temp;
        for (int j = 1; j < n; j++)
        {
            vector<int> v;
            for (int k = 0; k < n; k++)
            {
                if (k == i)
                    continue;
                else
                {
                    v.push_back(a[j][k]);
                }
            }
            temp.push_back(v);
        }

        if (i & 1)
            ans -= a[0][i] * determinantOfMatrix(temp, n - 1);
        else
            ans += a[0][i] * determinantOfMatrix(temp, n - 1);
    }
    return ans;
}
int main()
{
    return 0;
}