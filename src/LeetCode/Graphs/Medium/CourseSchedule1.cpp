#include <bits/stdc++.h>
using namespace std;
bool topoSort(unordered_map<int, vector<int>> adj, vector<int> &inDeg, int n)
{
    int count = 0;
    queue<int> q;
    for (int i = 0; i < n; i++)
    {
        if (inDeg[i] == 0)
        {
            count++;
            q.push(i);
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
                count++;
                q.push(v);
            }
        }
    }
    if(count == n){
        return true;
    }
    return false;
}
bool canFinish(int numCourses, vector<vector<int>> &prerequisites)
{
    unordered_map<int, vector<int>> adj;
    vector<int> inDeg(numCourses, 0);
    for (auto &vec : prerequisites)
    {
        int a = vec[0];
        int b = vec[1];
        adj[b].push_back(a);
        inDeg[a]++;
    }
    return topoSort(adj, inDeg, numCourses);
}
int main()
{
    return 0;
}