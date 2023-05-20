#include <bits/stdc++.h>
using namespace std;
void printTwoElements(int a[], int n)
{
    int x;
    for (x = 0; x < n; x++)
    {
        if (a[abs(a[x]) - 1] > 0)
            a[abs(a[x]) - 1] = -a[abs(a[x]) - 1];
        else
            cout << abs(a[x]) << " ";
    }
    for (x = 0; x < n; x++)
    {
        if (a[x] > 0)
            cout << (x + 1);
    }
    cout << endl;
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int a[n];
        for (int x = 0; x < n; x++)
        {
            cin >> a[x];
        }
        printTwoElements(a, n);
    }

    return 0;
}