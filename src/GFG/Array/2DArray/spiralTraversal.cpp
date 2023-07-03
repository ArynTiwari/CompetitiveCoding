#include <bits/stdc++.h>
using namespace std;
vector<int> spiralOrder(vector<vector<int>> &matrix)
{
    vector<int> ans;
    int m = matrix.size();    // row size
    int n = matrix[0].size(); // coloumn size
    int dir = 0;
    int left = 0, right = n-1, top = 0, down = m-1;
    /*
        dir =0 left->right //row constant
            =1 top ->down
            =2 right->left
            =3 down -> top
    */
    while (top <= down && left <= right)
    {
        if (dir == 0)
        {
            for (int i = left; i <= right; i++)
            {
                ans.push_back(matrix[top][i]);
            }
            top++;
        }
        if (dir == 1)
        {
            for (int i = top; i <= down; i++)
            {
                ans.push_back(matrix[i][right]);
            }
            right--;
        }
        if (dir == 2)
        {
            for (int i = right; i >= left; i--)
            {
                ans.push_back(matrix[down][i]);
            }
            down--;
        }
        if (dir == 3)
        {
            for (int i = down; i >= top; i--)
            {
                ans.push_back(matrix[i][left]);
            }
            left++;
        }
        dir++;
        if (dir == 4)
        {
            dir = 0;
        }
    }

    return ans;
}
int main()
{
    return 0;
}