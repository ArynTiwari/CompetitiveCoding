#include <bits/stdc++.h>
using namespace std;
void booleanMatrix(vector<vector<int>> &a)
{
    int row = a.size();
    int cols = a[0].size();
    vector<pair<int, int>> p;
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            if (a[i][j] == 1)
            {
                p.push_back({i, j});
            }
        }
    }
    for (int i = 0; i < p.size(); i++)
    {
        // row me change karne ka
        int t1 = p[i].first;
        int t2 = p[i].second;
        for (int j = 0; j < cols; j++)
        {
            a[t1][j] = 1;
        }
        // column me change karne ka
        for (int j = 0; j < row; j++)
        {
            a[j][t2] = 1;
        }
    }
}
int main()
{
    vector<vector<int>> a = {{1, 0, 0},
                             {1, 0, 0},
                             {1, 0, 0},
                             {0, 0, 0}};
    booleanMatrix(a);
    for (int i = 0; i < a.size(); i++)
    {
        for (int j = 0; j < a[0].size(); j++)
        {
            cout << a[i][j] << " ";
        }
    }

    return 0;
}