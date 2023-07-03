#include <bits/stdc++.h>
using namespace std;
int main()
{
    int arr[4][4] = {{10, 20, 30, 40}, {50, 60, 70, 80}, {27, 29, 47, 48}, {32, 33, 39, 50}};
    for (int i = 0; i < 4; i++)
    {
        if (i % 2 != 0)
        {
            for (int j = 3; j >= 0; j--)
            {
                cout << arr[i][j]<<" ";
            }
        }
        else
        {
            for (int j = 0; j < 4; j++)
            {
                cout<<arr[i][j]<<" ";
            }
        }
    }

    return 0;
}