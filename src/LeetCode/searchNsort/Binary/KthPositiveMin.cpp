#include <bits/stdc++.h>
using namespace std;
int kthPositiveElement(vector<int> &a, int k)
{
    int n = a.size();
    int l = 0, r = n - 1;
    while (l <= r)
    {
        int mid = l + (r - l) / 2;
        int missingTillNow = a[mid] - (mid + 1);
        if (missingTillNow < k)
        {
            l = mid + 1;
        }
        else
        {
            r = mid - 1;
        }
    }
    return (l + k);
}
int main()
{
    vector<int>a = {2,3,4,7,11};
    cout<<kthPositiveElement(a,2)<<endl;
    return 0;
}