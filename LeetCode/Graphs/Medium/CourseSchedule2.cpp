// return the topologiacl sorted order
#include <bits/stdc++.h>
using namespace std;
vector<int> topoSort(unordered_map<int, vector<int>> adj, int n, vector<int> inDeg)
{
    vector<int> result;
    int count = 0;
    queue<int> q;
    for (int i = 0; i < n; i++)
    {
        if (inDeg[i] == 0)
        { 
            q.push(i);
            count++;
            result.push_back(i);
        }
    }
    while (!q.empty())
    {
        int u = q.front();
        q.pop();
        for (int &v : adj[u])
        {
            inDeg[v]--;
            if (inDeg[v] == 0)
            {
                q.push(v);
                count++;
                result.push_back(v);
            }
        }
    }
    if (count == n)
    {
        return result;
    }
    return {};
}
vector<int> findOrder(int numCourses, vector<vector<int>> &prerequisites)
{
    vector<int> result;
    unordered_map<int, vector<int>> adj;
    vector<int> inDeg(numCourses, 0);
    for (auto &vec : prerequisites)
    {
        int a = vec[0];
        int b = vec[1];
        adj[b].push_back(a);
        inDeg[a]++;
    }
    return topoSort(adj, numCourses, inDeg);
}

int main()
{
    return 0;
}