#include <bits/stdc++.h>
using namespace std;
int main()
{
    int m = 3, n = 2;
    vector<int> arr[m];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < i+1; j++)
        {
            arr[i].push_back(i);
        }
    }
    for (auto &i : arr)
    {
        for (int j = 0; j < i.size(); j++)
        {
            cout << i[j]<<" ";
        }
        cout << endl;
    }

    return 0;
}