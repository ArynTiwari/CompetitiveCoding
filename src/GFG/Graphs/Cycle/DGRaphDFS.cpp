#include <bits/stdc++.h>
using namespace std;
bool isCycleDFS(vector<int> adj[], int u, vector<bool> &visited, vector<bool> &inRec)
{
    visited[u] = true;
    inRec[u] = true;
    for (int &v : adj[u])
    {
        if (visited[v] == false && isCycleDFS(adj, v, visited, inRec))
        {
            return true;
        }
        else if (inRec[v] == true)
        {
            return true;
        }
    }
    inRec[u] = false;
    return false;
}
bool isCyclic(int V, vector<int> adj[])
{
    // Code here
    vector<bool> visited(V, false);
    vector<bool> inRec(V, false);
    for (int i = 0; i < V; i++)
    {
        if (!visited[i] && isCycleDFS(adj, i, visited, inRec))
        {
            return true;
        }
    }

   
    return false;
}
int main()
{
    return 0;
}