#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> sumMatrix(const vector<vector<int>> &a, const vector<vector<int>> &b)
{

    int m1 = a.size();
    int n1 = a[0].size();
    int m2 = b.size();
    int n2 = b[0].size();
    vector<vector<int>> ans;
    if (m1 != m2 || n1 != n2)
    {
        return ans;
    }
    for (int i = 0; i < m1; i++)
    {
        vector<int> row;
        for (int j = 0; j < n1; j++)
        {

            int sum = 0;
            sum = a[i][j] + b[i][j];
            row.push_back(sum);
        }
        ans.push_back(row);
    }
    // for (int i = 0; i < ans.size(); i++)
    // {
    //     for (int j = 0; j < ans[0].size(); j++)
    //     {
    //         cout << ans[i][j] << " ";
    //     }
    // }

    return ans;
}
int main()
{
    vector<vector<int>> a = {{1, 2, 3}, {4, 5, 6}};
    vector<vector<int>> b = {{1, 3, 3}, {2, 3, 3}, {1}};
    sumMatrix(a, b);
    return 0;
}