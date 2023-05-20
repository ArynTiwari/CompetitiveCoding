#include <bits/stdc++.h>
using namespace std;
void DFS(vector<int> adj[], int u, vector<bool> &visited, stack<int> &s)
{
    visited[u] = true;
    for (int &v : adj[u])
    {
        if (!visited[v])
        {
            DFS(adj, v, visited, s);
        }
    }
    s.push(u);
}
vector<int> topoSort(int V, vector<int> adj[])
{
    // code here
    vector<bool> visited(V, false);
    stack<int> s;
    for (int i = 0; i < V; i++)
    {
        if (!visited[i])
        {
            DFS(adj, i, visited, s);
        }
    }
    vector<int> result;
    while (!s.empty())
    {
        result.push_back(s.top());
        s.pop();
    }
    return result;
}
int main()
{
    return 0;
}