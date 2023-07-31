#include <bits/stdc++.h>
using namespace std;
bool isFeasible(int a[], int n, int m, int mid)
{
    int sum = 0, req = 1;
    for (int i = 0; i < n; i++)
    {
        if (a[i] + sum > mid)
        {
            req++;
            //allocate sum pages to the new student
            sum = a[i];
        }
        else
        {
            sum += a[i];
        }
    }
    return (req <= m);
}
int findPages(int a[], int n, int m)
{
    // code here
    if (n < m)
    {
        return -1;
    }
    int sum = 0, maxx = a[0];
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
        if (a[i] > maxx)
        {
            maxx = a[i];
        }
    }
    int l = maxx, r = sum;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        if (isFeasible(a, n, m, mid))
        {
            r = mid - 1;
        }
        else
        {
            l = mid + 1;
        }
    }
    return l;
}
int main()
{
    return 0;
}