#include <bits/stdc++.h>
using namespace std;
bool checkFreq(string &s)
{
    int arr[26] = {0};
    for (char &ch : s)
    {
        arr[ch - 'a']++;
        if (arr[ch - 'a'] > 1)
        {
            return true;
        }
    }
    return false;
}
bool buddyStrings(string s, string goal)
{
    int n = s.size();
    int m = goal.size();
    if (n != m)
    {
        return false;
    }
    if (s == goal)
    {
        return checkFreq(s);
    }
    vector<int> indices;
    for (int i = 0; i < n; i++)
    {
        if (s[i] != goal[i])
        {
            indices.push_back(i);
        }
    }
    if (indices.size() != 2)
    {
        return false;
    }
    swap(s[indices[0]], s[indices[1]]);
    return s == goal;
}
int main()
{
    return 0;
}