#include <bits/stdc++.h>
using namespace std;
int minSubArrayLen(int target, vector<int> &a)
{
    int n = a.size();
    int i = 0, j = 0, sum = 0, size = INT_MAX;
    while (j < n)
    {
        sum = sum + a[j];
        while (sum >= target)
        {
            size = min(size, j - i + 1);
            sum -= a[i];
            i++;
        }
        j++;
    }
    return size == INT_MAX ? 0 : size;
}
int main()
{
    return 0;
}