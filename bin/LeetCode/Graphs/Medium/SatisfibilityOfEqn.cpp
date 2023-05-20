#include <bits/stdc++.h>
using namespace std;
vector<int> par;
vector<int> rankk;

int find(int i)
{
    if (par[i] != i)
        par[i] = find(par[i]);

    return par[i];
}

void Union(int x, int y)
{
    int p_x = find(x);
    int p_y = find(y);

    if (p_x != p_y)
    {
        if (rankk[p_x] > rankk[p_y])
        {
            par[p_y] = p_x;
        }
        else if (rankk[p_y] > rankk[p_x])
        {
            par[p_x] = p_y;
        }
        else
        {
            par[p_x] = p_y;
            rankk[p_y]++;
        }
    }
}
bool equationsPossible(vector<string> &equations)
{
    par.resize(26);
    rankk.resize(26);
    for (int i = 0; i < 26; i++)
    {
        par[i] = i;
    }
    for (string &s : equations)
    {
        if (s[1] == '=')
        {
            Union(s[0] - '0', s[3] - '0');
        }
    }
    for (string &s : equations)
    {
        if (s[1] == '!')
        {
            char f = s[0];
            char l = s[3];
            int par_f=find(f-'0');
            int par_l=find(l-'0');
            if(par_f == par_l){
                return false;
            }
        }
    }
    return true;
}
int main()
{
    return 0;
}