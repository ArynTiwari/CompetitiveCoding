#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> multiplyMatrix(const vector<vector<int>> &a, const vector<vector<int>> &b)
{
    if (a[0].size() != b.size())
    {
        return {};
    }
    vector<vector<int>> sum;
    for (int i = 0; i < a.size(); i++)
    {
        vector<int> row;
        for (int j = 0; j < b[0].size(); j++)
        {
            int multiply = 0;
            for (int z = 0; z < a[0].size(); z++)
            {
                multiply += (a[i][z] * b[z][j]);
            }
            row.push_back(multiply);
        }
        sum.push_back(row);
    }
    return sum;
}
int main()
{
    return 0;
}