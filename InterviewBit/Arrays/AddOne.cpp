#include <bits/stdc++.h>
using namespace std;
vector<int> plusOne(vector<int> &a)
{
    int n = a.size(), carry = 0;
    int sum = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        i == n - 1 ? sum = a[i] + carry + 1 : sum = a[i] + carry;
        if (sum > 9)
        {
            a[i] = 0;
            carry = 1;
        }
        else
        {
            a[i] = sum;
            carry = 0;
        }
    }
    if (carry == 1)
    {
        a.resize(n + 1);
        for (int i = 0; i < n + 1; i++)
        {
            i == 0 ? a[i] = 1 : a[i] = 0;
        }
    }
    int x = a.size();
   while(a[0]==0)
    {
        a.erase(a.begin());
    }
    return a;
}
int main()
{
    vector<int> a = {0,0,0, 3, 7, 6, 4, 0, 5, 5, 5};
    plusOne(a);
    for (int &i : a)
    {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}