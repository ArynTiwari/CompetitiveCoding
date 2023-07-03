#include <bits/stdc++.h>
using namespace std;
void searc(vector<vector<int>> arr, int x)
{
    int m = arr.size();
    int i = 0, j = arr[0].size() - 1;
    cout<<arr[m][j]<<" ";
    while (i < m && j >= 0)
    {
        if (arr[i][j] == x)
        {
            cout << i << j << endl;
            return;
        }
        else if (x > arr[i][j])
        {
            i++;
        }
        else
        {
            j--;
        }
    }
    cout << "Not found" << endl;
}
int main()
{
    vector<vector<int>> arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    searc(arr, 310);
    cout<<arr[0][0]<<endl;
    return 0;
}