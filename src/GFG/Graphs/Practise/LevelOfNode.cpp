#include<bits/stdc++.h>
using namespace std;
class Sol{
public:
    void bfs(vector<int> adj[],vector<bool>&visited,vector<int>&level,int i) {
        visited[i]=true;
        queue<int>q;
        q.push(i);
        while(!q.empty()){
            int u = q.front();
            q.pop();
            for(auto &v : adj[u]){
                if(!visited[v]){
                    level[v]=level[u]+1;
                    q.push(v);
                }
            }
        }
    }
    int nodeLevel(int V, vector<int> adj[], int X)
    {
        vector<bool>visited(V,false);
        vector<int>level(V,0);
        bfs(adj,visited,level,0);
        for(int i=0;i< level.size();i++){
            if(i==X){
                return level[i];
            }
        }
        return -1;
    }
};
int main()
{
    return 0;
}