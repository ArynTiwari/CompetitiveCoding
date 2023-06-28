#include <bits/stdc++.h>
using namespace std;
bool canEat(vector<int> &piles, int givenBanana, int h)
{
    int acutalBanana = 0;
    for (auto &i : piles)
    {
        acutalBanana += i / givenBanana;
        if (i % givenBanana != 0)
        {
            acutalBanana++;
        }
    }
    return (acutalBanana <= h);
}
int minEatingSpeed(vector<int> &piles, int h)
{
    int l = 1, r = *max_element(begin(piles), end(piles));
    while (l < r)
    {
        int mid = l + (r - l) / 2;
        if (canEat(piles, mid, h))
        {
            r = mid;
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
    vector<int> piles = {3, 6, 7, 11};
    cout << minEatingSpeed(piles, 8);
    return 0;
}