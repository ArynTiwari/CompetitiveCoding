#include <bits/stdc++.h>
using namespace std;
vector<int> topoSort(int V, vector<int> adj[])
{
    queue<int> q;
    vector<int> inDeg(V, 0);
    vector<int> result;
    for (int u = 0; u < V; u++)
    {
        for (int &v : adj[u])
        {
            inDeg[v]++;
        }
    }
    // 2 nd step
    for (int i = 0; i < V; i++)
    {
        if (inDeg[i] == 0)
        {
            q.push(i);
        }
    }
    while (!q.empty())
    {
        int u = q.front();
        result.push_back(u);
        q.pop();
        for (int &v : adj[u])
        {
            inDeg[v]--;
            if (inDeg[v] == 0)
            {
                q.push(v);
            }
        }
    }
    return result;
}
int main()
{
    return 0;
}