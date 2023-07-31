#include <bits/stdc++.h>
using namespace std;
vector<int> missingRepeat(vector<int> &A)
{
    long long sum = 0;

    long long n = A.size();

    long long totalSum = (n * (n + 1)) / 2;

    int x = 0, y = 0;

    long long squareSum = (n * (n + 1) * ((2 * n) + 1)) / 6;

    for (auto e : A)
    {

        totalSum -= (long long)e;

        squareSum -= ((long long)e * (long long)e);
    }

    x = (squareSum - (totalSum * totalSum)) / (2 * totalSum);

    y = (totalSum + x);

    return {x, y};
}
int main()
{
    return 0;
}