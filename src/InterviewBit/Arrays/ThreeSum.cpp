#include <bits/stdc++.h>
using namespace std;
int solve(vector<int> &a)
{
    int n = a.size();
    int sum = 0;
    if (n < 3)
    {
        return 0;
    }
    vector<int>vec(n,0);
    vec[n-1]=a[n-1];
    for (int i = n-2; i >=0; i--)
    {
        vec[i] = max(vec[i+1],a[i]);
    }
    for (int i = 0; i < vec.size(); i++)
    {
        cout<<vec[i]<<" ";
    }
    set<int>s;
    s.insert(a[0]);
    for (int i = 1; i < n; i++)
    {
        s.insert(a[i]);
        auto it = s.find(a[i]);
        if(it!=s.begin() && vec[i]!=a[i]){
            sum = max(sum,(*--it)+a[i]+vec[i]);
        }
    }
    
    return sum;
}

int main()
{
    vector<int>a={2,5,3,1,4,9};
    solve(a);
    return 0;
}
