#include <bits/stdc++.h>
using namespace std;
int guessNumber(int n)
{
    int l = 1, r = n;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        cout << mid << l << r << " ";
        if (mid == n)
        {
            return 0;
        }
        else if (mid > n)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    return -1;
}
int main()
{
    guessNumber(6);
    return 0;
}