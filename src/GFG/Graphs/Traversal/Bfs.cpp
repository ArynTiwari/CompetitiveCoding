#include <bits/stdc++.h>
using namespace std;
void BFS(unordered_map<int, vector<int>> mp, vector<bool> &visited, int u, vector<int> &result)
{
    queue<int> que;
    que.push(u);
    visited[u] = true;
    result.push_back(u);
    while (!que.empty())
    {
        int u = que.front();
        que.pop();
        for (int &v : mp[u])
        {
            if (!visited[v])
            {
                que.push(v);
                visited[v] = true;
                cout<<v<<" ";
            }
        }
    }
}
vector<int> bfsOfGraph(int V, vector<int> adj[])
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
    BFS(mp, visited, 0, result);
    return result;
}

int main()
{
    return 0;
}