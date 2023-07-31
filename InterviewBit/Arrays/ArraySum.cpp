#include <bits/stdc++.h>
using namespace std;
vector<int> addArrays(vector<int> &a, vector<int> &b)
{
    vector<int> ans;
    int carry = 0;
    int i = a.size() - 1, j = b.size() - 1;
    while (i >= 0 || j >= 0 || carry)
    {
        int x = i >= 0 ? a[i--] : 0;
        int y = j >= 0 ? b[j--] : 0;
        int sum = carry + x + y;
        ans.push_back(sum % 10);
        carry = sum / 10;
    }
    reverse(ans.begin(), ans.end());
    return ans;
}
int main()
{
    return 0;
}