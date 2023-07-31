#include <bits/stdc++.h>
using namespace std;
int mostWordsFound(vector<string> &sentences)
{
    int maxx = 0;
    for (string &sentence : sentences)
    {
        int count=0;
        for (int i = 0; i < sentence.length(); i++)
        {
            cout<<sentence[i]<<" ";
            if (sentence[i] == ' ')
            {
                count++;
            }
        }
        maxx = max(count,maxx);
    }
    return maxx+1;
}
int main()
{
    vector<string> sentences = {"please wait", "continue to fight", "continue to win"};
    cout<< mostWordsFound(sentences);
    return 0;
}