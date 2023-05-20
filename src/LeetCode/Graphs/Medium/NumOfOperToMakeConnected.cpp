#include <bits/stdc++.h>
using namespace std;
vector<int> parent;
vector<int> rankk;
int find(int i)
{
    if (parent[i] == i)
    {
        return i;
    }
    return parent[i] = find(parent[i]);
}
void Union(int x, int y)
{
    int x_par = find(x);
    int y_par = find(y);
    if (rankk[x_par] > rankk[y_par])
    {
        parent[y_par] = x_par;
    }
    else if (rankk[x_par] < rankk[y_par])
    {
        parent[x_par] = y_par;
    }
    else
    {
        parent[x_par] = y_par;
        rankk[y_par]++;
    }
}
int makeConnected(int n, vector<vector<int>> &connections)
{
    if (connections.size() < n - 1)
    {
        return -1;
    }
    parent.resize(n);
    rankk.resize(n, 0);
    for (int i = 0; i < n; i++)
    {
        parent[i] = i;
    }
    int comp = n;
    for (auto &v : connections)
    {
        if (find(v[0]) != find(v[1]))
        {
            Union(v[0], v[1]);
            comp--;
        }
    }
    return comp - 1;
}
int main()
{
    return 0;
}