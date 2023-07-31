#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> diagonalSort(vector<vector<int>> &mat)
{
    vector<vector<int>> ans;
    unordered_map<int, vector<int>> mp;
    int m = mat.size(), n = mat[0].size();
    // storing
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            mp[i - j].push_back(mat[i][j]);
        }
    }
    // sorting
    for (auto &i : mp)
    {
        sort(begin(i.second), end(i.second));
    }
    // pushing back in matrix
    for (int i = m - 1; i >= 0; i--)
    {
        for (int j = n - 1; j >= 0; j--)
        {
            mat[i][j] = mp[i - j].back();
            mp[i - j].pop_back();
        }
    }

    return mat;
}
int main()
{
    vector<vector<int>> mat = {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}};
    vector<vector<int>> ans = diagonalSort(mat);
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[0].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}