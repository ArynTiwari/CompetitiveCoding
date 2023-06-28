#include <bits/stdc++.h>
using namespace std;
vector<int> twoRepeated(int arr[], int n)
{
    vector<int> v;
    for (int i = 0; i < n + 2; i++)
    {
        if (arr[abs(arr[i])] > 0)
        {
            arr[abs(arr[i])] *= -1;
        }
        else
        {
            v.push_back(abs(arr[i]));
        }
    }
    return v;
}
int main()
{
    int n = 4;
    int arr[6] = {1, 2, 1, 3, 4, 3};
    twoRepeated(arr, n);
    return 0;
}