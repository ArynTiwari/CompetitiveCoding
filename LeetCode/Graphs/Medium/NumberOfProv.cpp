#include <bits/stdc++.h>
using namespace std;
int DFS(vector<vector<int>> &isConnected, vector<bool> &visited, int u)
{
    visited[u] = true;
    int m = isConnected.size();

    for (int v = 0; v < m; v++)
    {
        if (!visited[v] && isConnected[u][v] == 1)
        {
            DFS(isConnected, visited, v);
        }
    }
}
int findCircleNum(vector<vector<int>> &isConnected)
{
    int n = isConnected.size();
    vector<bool> visited(n, false);

    int count = 0;

    for (int i = 0; i < n; i++)
    {
        if (!visited[i])
        {
            count++;
            DFS(isConnected, visited, i);
        }
    }
    return count;
}
int main()
{
    return 0;
}