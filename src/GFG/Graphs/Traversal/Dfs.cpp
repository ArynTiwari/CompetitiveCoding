#include <bits/stdc++.h>
using namespace std;
void DFS(unordered_map<int, vector<int>> &mp, vector<bool> &visited, int u, vector<int> &result)
{
    if (visited[u] == true)
    {
        return;
    }
    visited[u] = true;
    result.push_back(u);
    for (int &v : mp[u])
    {
        if (!visited[v])
        {
            DFS(mp, visited, v,result);
        }
    }
}
vector<int> dfsOfGraph(int V, vector<int> adj[])
{
    // Code here
    unordered_map<int, vector<int>> mp;
    for (int u = 0; u < V; u++)
    {
        for (auto v = adj[u].begin(); v != adj[u].end(); v++)
        {
            mp[u].push_back(*v);
        }
    }
    vector<int> result;
    vector<bool> visited(V, false);
    DFS(mp, visited, 0, result);
    return result;
}
int main()
{

    return 0;
}