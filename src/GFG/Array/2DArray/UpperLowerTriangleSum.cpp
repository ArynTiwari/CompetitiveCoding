#include <bits/stdc++.h>
using namespace std;
vector<int> sumTriangles(const vector<vector<int>> &a, int n)
{
    // code here
    vector<int> upper;
    vector<int> lower;
    int x = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = x; j < n; j++)
        {
            upper.push_back(a[i][j]);
        }
        x++;
    }
    int y = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j <= y; j++)
        {
            lower.push_back(a[i][j]);
        }
        y++;
    }
    int sum1 = accumulate(upper.begin(), upper.end(), 0);
    int sum2 = accumulate(lower.begin(), lower.end(), 0);
    return {sum1, sum2};
}
int main()
{
    vector<vector<int>> a = {{6, 5, 4},
                             {1, 2, 5},
                             {7, 9, 7}};
    vector<int> answer = sumTriangles(a, a.size());
    for (auto &&i : answer)
    {
        cout << i << " ";
    }

    return 0;
}