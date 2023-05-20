#include <bits/stdc++.h>
using namespace std;
int nearestNum(int n)
{
    int sqrt_n = floor(std::sqrt(n));
    cout << "Vale is " << sqrt_n << endl;
    int lower_square = (sqrt_n) * (sqrt_n);
    int middle_square = (sqrt_n - 1) * (sqrt_n - 1);
    int upper_square = (sqrt_n + 1) * (sqrt_n + 1);
    int lowerDis = n - lower_square;
    int UpperDis = upper_square - n;
    cout << "Upper square is" << upper_square << endl;
    cout << "middle id" << middle_square << endl;
    cout << "Lower square is" << lower_square << endl;
    if (lowerDis == UpperDis)
    {
        return upper_square;
    }
    else if (lowerDis < UpperDis)
    {
        return lower_square;
    }
    else
    {
        return upper_square;
    }
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        cout << nearestNum(n) << endl;
    }
    return 0;
}