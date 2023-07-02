#include <bits/stdc++.h>
using namespace std;
int repeatedNumber(const vector<int> &arr)
{
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int i, candidate = -1, votes = 0, n = arr.size();
    // Finding majority candidate
    for (i = 0; i < n; i++)
    {
        if (votes > n / 3)
        {
            break;
        }
        if (votes == 0)
        {
            candidate = arr[i];
            cout << candidate << endl;
            votes = 1;
        }
        else
        {
            if (arr[i] == candidate)
                votes++;

            else
                votes--;
        }
    }
    int count = 0;
    // Checking if majority candidate occurs more than n/2
    // times
    for (i = 0; i < n; i++)
    {
        if (arr[i] == candidate)
            count++;
    }

    if (count > n / 3)
        return candidate;
    return -1;
}
int main()
{
    vector<int> a = {1, 1,2, 3, 5, 7};
    cout << repeatedNumber(a);
    return 0;
}