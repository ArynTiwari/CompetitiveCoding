#include<bits/stdc++.h>
using namespace std;
vector<int> parent;
vector<int> rankk;
int find(int i){
    if(parent[i]==i){
        return i;
    }
    return parent[i] = find(parent[i]);
}
void Union(int x,int y){
    int x_par = find(x);
    int y_par = find(y);
    if(rankk[x_par]>rankk[y_par]){
        parent[y_par] = x_par;
    }
    else if (rankk[x_par] < rankk[y_par])
    {
        parent[x_par] = y_par;
    }
    else{
        parent[x_par] = y_par;
        rankk[y_par]++;
    }
}
long long countPairs(int n, vector<vector<int>> &edges)
{
    parent.resize(n);
    rankk.resize(n,0);
    for(int i=0;i<n;i++){
        parent[i] = i;
    }
    for(auto &vec : edges){
        int u = vec[0];
        int v = vec[1];
        Union(u,v);
    }
    //step 3 , create map
    unordered_map<int,int>mp;
    for(int i=0;i<n;i++){
        int par = find(i);
        mp[par]++;
    }
    //step 4, find result using map
    long long result = 0;
    long long remaining= n;
    for(auto &i : mp){
        long long size = i.second;
        result+= (size)* (remaining -size);
        remaining-=size;
    }
    return result;
}
int main()
{
    return 0;
}