#include <bits/stdc++.h>
using namespace std;
int solve(vector<int> &a, int b)
{
    int count = 0;
    int i = 0, n = a.size();
    while (i < n)
    {
        int right = min(i + b - 1, n - 1);
        int left = max(i - b + 1, 0);
        bool found = false;
        while (right >= left)
        {
            if (a[right] == 1)
            {
                found = true;
                break;
            }
            right--;
        }
        if (!found)
        {
            return -1;
        }
        count++;
        i = right + b;
    }

    return count;
}
int main()
{
    vector<int>vec={0,0,1,1,1,0,0,1};
    cout<<solve(vec,3)<<endl;
    return 0;
}