#include <bits/stdc++.h>
using namespace std;
vector<int> diagonalTraverse(vector<vector<int>> &mat)
{
    int m = mat.size();
    int n = mat[0].size();

    map<int, vector<int>> mp;

    vector<int> ans;

    // fill the map using [i+j]
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            mp[i + j].push_back(mat[i][j]);
        }
    }

    bool flip = true;
    for (auto &it : mp)
    {
        if (flip)
        {
            reverse(it.second.begin(), it.second.end());
        }

        for (int &num : it.second)
        {
            ans.push_back(num);
        }

        flip = !flip;
    }

    return ans;
}
int main()
{
    return 0;
}