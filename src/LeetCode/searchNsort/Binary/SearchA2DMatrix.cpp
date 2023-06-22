#include <bits/stdc++.h>
using namespace std;
bool searchMatrix(vector<vector<int>> &matrix, int target)
{
    // start = 0
    // end = m*n -1;
    //  mid = start +(end-start+1);
    // to map 1d array to 2d arrya
    int m = matrix.size();
    int n = matrix[0].size();

    int i = 0, j = m * n - 1;
    while (i <= j)
    {
        int mid = i + (j - i) / 2;
        if (matrix[mid / n][mid % n] > target)
        {
            j = mid - 1;
        }
        else if (matrix[mid / n][mid % n] < target)
        {
            i = mid + 1;
        }
        else
        {
            return true;
        }
    }
    return false;
}
int main()
{
    return 0;
}