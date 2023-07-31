#include <bits/stdc++.h>
using namespace std;
vector<int> permutate(int n, string str)
{
    // int s = 1, l = n;
    vector<int> ans(n);
      for(int i=0;i<n;i++){
        ans[i]=i+1;
    }
    // iota(ans.begin(), ans.end(), 1);
    // for (int i = 0; i <= str.size(); i++)
    // {
    //     cout<<i<<endl;
    //     if (str[i] == 'I')
    //     {
    //         ans.push_back(s);
    //         s++;
    //     }
    //     else
    //     {
    //         ans.push_back(l);
    //         l--;
    //     }
    // }
    for (int i = 0; i < str.size(); i++)
    {
        if (str[i] == 'D')
        {
            int maxFromRight = -1;
            for (int j = n; j > i; j--)
            {
                if (ans[j] > ans[i])
                {
                    maxFromRight = j;
                    break;
                }
            }
            if (maxFromRight != -1)
            {
                swap(ans[maxFromRight], ans[i]);
            }
        }
        else
        {

            int minFromRight = -1;
            for (int j = n-1; j > i; j--)
            {
                if (ans[j] < ans[i])
                {
                    minFromRight = j;
                    break;
                }
            }
            if (minFromRight != -1)
            {
                swap(ans[minFromRight], ans[i]);
            }
        }
    }

    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }

    return ans;
}
int main()
{
    int n = 5;
    string s = "IDDD";
    permutate(n, s);
    return 0;
}