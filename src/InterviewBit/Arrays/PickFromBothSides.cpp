#include <bits/stdc++.h>
using namespace std;
int solve(vector<int> &a, int b)
{
    int n = a.size();
    int totalSum = 0, subSum = 0;
    for (int i = 0; i < n; i++)
    {
        totalSum += a[i];
    }
    int wind = n - b;
    if (wind < 1)
    {
        return totalSum;
    }
    for (int i = 0; i < wind; i++)
    {
        subSum += a[i];
    }
    int ans = INT_MIN;
    ans = max(ans, subSum);
    for (int j = wind; j < n; j++)
    {
        subSum = subSum - a[j - wind] + a[j];
        ans = max(ans, totalSum-subSum);
    }

    return ans;
}
int main()
{
    vector<int> a = {-969, -948, 350, 150, -59, 724, 966, 430, 107, -809, -993, 337, 457, -713, 753, -617, -55, -91, -791, 758, -779, -412, -578, -54, 506, 30, -587, 168, -100, -409, -238, 655, 410, -641, 624, -463, 548, -517, 595, -959, 602, -650, -709, -164, 374, 20, -404, -979, 348, 199, 668, -516, -719, -266, -947, 999, -582, 938, -100, 788, -873, -533, 728, -107, -352, -517, 807, -579, -690, -383, -187, 514, -691, 616, -65, 451, -400, 249, -481, 556, -202, -697, -776, 8, 844, -391, -11, -298, 195, -515, 93, -657, -477, 587};
    int b = 81;
    cout << solve(a, b) << endl;
    return 0;
}