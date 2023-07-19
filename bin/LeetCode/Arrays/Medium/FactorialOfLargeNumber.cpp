#include <bits/stdc++.h>
using namespace std;
void Multiply(vector<int> &arr, int multiplier)
{
    int n = arr.size();
    int rem = 0;
    int curr;
    for (int it = 0; it < n; it++)
    {
        curr = arr[it] * multiplier;
        curr += rem;
        arr[it] = curr % 10;
        rem = curr / 10;
    }
    while (rem > 0)
    {
        arr.push_back(rem % 10);
        rem = rem / 10;
    }
}
vector<int> factorial(int N)
{
    // code here
    vector<int> ans;

    ans.push_back(1);

    for (int i = 2; i <= N; i++)
    {
        Multiply(ans, i);
    }
    reverse(ans.begin(), ans.end());
    return ans;
}

int main()
{

    vector<int> ans = factorial(5);
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }

    return 0;
}