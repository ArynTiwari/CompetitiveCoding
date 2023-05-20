#include <bits/stdc++.h>
using namespace std;
int findParent(vector<int> parent, int i)
{
    int a = 10;
    cout<<a;
    int b;
    b= 10;
    cout<<(a==b);
    if (i == parent[i])
    {
        return i;
    }
    return findParent(parent, parent[i]);
}
void unoion(int x, int y, vector<int> parent)
{
    int x_par = findParent(parent, x);
    int y_par = findParent(parent, y);
    if (x_par != y_par)
    {
        parent[x_par] = y_par;
    }
}
//optimised code
int optmFind(vector<int> parent, int i){
    if (i == parent[i])
    {
        return i;
    }
    return parent[i]= findParent(parent, parent[i]);
}
void optmUnion(int x, int y, vector<int> parent, vector<int> rank)
{
    int x_parent = optmFind(parent,x);
    int y_parent = optmFind(parent,y);

    if (rank[x_parent] > rank[y_parent])
    {
        parent[y_parent] = x_parent;
    }
    else if (rank[x_parent] < rank[y_parent])
    {
        parent[x_parent] = y_parent;
    }
    else
    {
        parent[x_parent] = y_parent;
        rank[y_parent]++;
    }
}

int main()
{
    cout<<" hello"<<endl;
    return 0;
}