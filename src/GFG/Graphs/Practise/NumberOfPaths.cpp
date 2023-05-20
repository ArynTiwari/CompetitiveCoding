#include<bits/stdc++.h>
using namespace std;
void bfs(vector<int> adj[],vector<bool>&visited, int destination, int i,int &ans){
    visited[i]=true;
    queue<int> q;
    q.push(i);
    while (!q.empty())
    {
        int u=q.front();
        q.pop();
        for(auto &v:adj[u]){
            if(v ==destination){
                ans++;
            }
            if(!visited[v]){
                q.push(v);
                visited[v]=true;
            }
        }
    }
    
}
int countPaths(int V, vector<int> adj[], int source, int destination)
{
    // Code here
    int ans=0;
    vector<bool>visited(V,false);
    for (int i = 0; i < V; i++)
    {
        bfs(adj,visited,destination,source,ans);
    }
    
    return ans;
}
int main()
{
    return 0;
}