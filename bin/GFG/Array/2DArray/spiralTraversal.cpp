#include <bits/stdc++.h>
using namespace std;
vector<int> spiralOrder(vector<vector<int>> &matrix)
{
    vector<int> ans;
    int n = matrix.size();
    int top = 0, down = matrix.size(), left = matrix.size(), right = 0;
    if (n == 1)
    {
        for (int i = 0; i < n; i++)
        {
            ans.push_back(matrix[0][i]);
        }
    }
    return ans;
}
int main()
{
    return 0;
}