#include <bits/stdc++.h>
using namespace std;
int main()
{
    int maxx = INT_MIN;

    int total = 0;

    for (int i = 0; i < n; i++)
    {

        int row_sum = 0, col_sum = 0;

        for (int j = 0; j < n; j++)
        {

            row_sum += matrix[i][j];

            col_sum += matrix[j][i];

            total += matrix[i][j];
        }

        maxx = max(maxx, max(row_sum, col_sum));
    }

    return (n * maxx - total);

    return 0;
}