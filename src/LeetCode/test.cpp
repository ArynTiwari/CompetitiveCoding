#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> generate(int numRows)
{
    vector<vector<int>> vec;

    for (int i = 0; i < numRows; i++)
    {
        vector<int> res(i + 1, 1);
        for (int j = 1; j < i; j++)
        {
            res[j] = vec[i - 1][j] + vec[i - 1][j - 1];
        }
        vec.push_back(res);
    }

    return vec;
}
int main()
{
    vector<vector<int>> ans = generate(5);
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}