#include <bits/stdc++.h>
using namespace std;
int countSteps(int n)
{
    // if (n == 1)
    // {
    //     return 0;
    // }
    // else if (n % 2 == 0)
    // {
    //     return 1 + countSteps(n / 2);
    // }
    // else
    // {
    //     return 1 + min(countSteps(n - 1), countSteps(n + 1));
    // }
    int count=0;
    while(n>1){
        count++;
        if(n %2==0){
            n /=2;
        }
        else if(n %4 ==1 || n==3){
            n -=1;
        }
        else{
            n +=1;
        }
    }
    return count;
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, count = 0;
        cin >> n;
        cout << countSteps(n) << "\n";
    }

    return 0;
}