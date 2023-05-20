#include<bits/stdc++.h>
using namespace std;
vector<vector<int>> printGraph(int V, vector<int> adj[])
{
    // Code here
    vector<vector<int>> vec;
    for (int i = 0; i < V; i++)
    {
        for (auto &v : adj[i])
        {
            vec[i].push_back(v);
        }
    }
    return vec;
}
int main()
{
    return 0;
}