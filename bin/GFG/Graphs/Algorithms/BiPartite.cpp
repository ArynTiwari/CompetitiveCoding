#include <bits/stdc++.h>
using namespace std;
bool dfs(vector<int> adj[], vector<int> color, int u, int col)
{
    color[u] = col;
    for (int &v : adj[u])
    {
        if (color[v] == color[u])
        {
            return false;
        }
        if (color[v] == -1)
        {
            int c = 1 - col;
            if (dfs(adj, color, v, c) == false)
            {
                return false;
            }
        }
    }
    return true;
}
bool isBipartite(int V, vector<int> adj[])
{
    // Code here
    vector<int> color(V, -1);
    for (int i = 0; i < V; i++)
    {
        if (color[i] == -1)
        {
            if (dfs(adj, color, i, 1) == false)
            {
                return false;
            }
        }
    }
    return true;
}
int main()
{
    return 0;
}