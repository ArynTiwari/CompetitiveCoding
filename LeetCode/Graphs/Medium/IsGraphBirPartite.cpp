#include<bits/stdc++.h>
using namespace std;
class Solution
{
public:
    bool bfs(vector<vector<int>> adj, int node, vector<int> color, int currColor)
    {
        queue<int> q;
        q.push(node);
        color[node] = currColor;
        while (!q.empty())
        {
            int u = q.front();
            q.pop();
            for (int &v : adj[u])
            {
                if (color[u] == color[v])
                {
                    return false;
                }
                else if (color[v] == -1)
                {
                    color[v] = 1 - color[u];
                    q.push(v);
                }
            }
        }
        return true;
    }
    bool isBipartite(vector<vector<int>> &adj)
    {
        int V = adj.size();
        vector<int> color(V, -1);
        for (int i = 0; i < V; i++)
        {
            if (color[i] == -1)
            {
                if (bfs(adj, i, color, 1) == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
};
int main()
{
    return 0;
}