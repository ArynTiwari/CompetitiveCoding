#include <bits/stdc++.h>
using namespace std;
// vector<vector<string>> groupAnagrams(vector<string> &strs)
// {
//     int n = strs.size();
//     vector<vector<string>> result;
//     unordered_map<string, vector<string>> mp;
//     for (int i = 0; i < n; i++)
//     {
//         string temp = strs[i];
//         sort(begin(temp), end(temp));
//         mp[temp].push_back(strs[i]);
//     }
//     for (auto it : mp)
//     {
//         result.push_back(it.second);
//     }
//     return result;
// }
// without sorting
string generate(string &word)
{
    int arr[26] = {0};
    for (auto ch : word)
    {
        arr[ch - 'a']++;
    }
    string newWord = "";
    for (int i = 0; i < 26; i++)
    {
        int freq = arr[i];
        if (freq > 0)
        {
            newWord += string(freq, i + 'a');
        }
    }
    return newWord;
}
vector<vector<string>> groupAnagrams(vector<string> &s)
{
    int n = s.size();
    unordered_map<string, vector<string>> mp;
    vector<vector<string>> ans;
    for (int i = 0; i < n; i++)
    {
        string word = s[i];
        string newWord = generate(word);
        mp[newWord].push_back(word);
    }
    for (auto i : mp)
    {
        ans.push_back(i.second);
    }
}
int main()
{
    return 0;
}