#include<bits/stdc++.h>
using namespace std;
bool isAnagram(string s, string t)
{
    if(s.length() != t.length()){
        return false;
    }
    sort(s.begin(),s.end());
    sort(t.begin(), t.end());
    for (int i = 0; i < s.length(); i++)
    {
        if(s.at(i)!=t.at(i)){
            return false;
        }
    }
    

    return true;
}
void dfs(){

}
int main()
{
    string s = "aryan";
    string t = "rynan";
    cout<<isAnagram(s,t);
    return 0;
}