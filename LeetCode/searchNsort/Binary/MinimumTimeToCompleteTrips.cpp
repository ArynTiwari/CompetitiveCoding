#include <bits/stdc++.h>
using namespace std;
long long minimumTime(vector<int> &time, int totalTrips)
{
    int t = 1;
    int n = time.size();
    vector<int> help(n, 0);
    while (accumulate(help.begin(),help.end(),0)!=totalTrips)
    {
        for(int i=0;i<n;i++){
            help[i]= time[i]/t;
        }
        t++;
    }
    return t;

}
// binary search
// bool isPossible(vector<int>&time,long long givenTime,int totalTrips){
//     long long actualTrips=0;
//     for(int &t:time){
//         actualTrips+=givenTime/t;
//     }
//     return (actualTrips>=totalTrips);
// }
// long long minimumTime(vector<int> &time, int totalTrips)
// {
//     int minn = *min_element(time.begin(), time.end());
//     long long l = 1, r = (long long)minn * totalTrips;
//     while (l < r)
//     {
//         long long mid = l + (r - l) / 2;
//         if (isPossible(time,mid,totalTrips))
//         {
//             r = mid;
//         }
//         else
//         {
//             l = mid + 1;
//         }
//     }
//     return l;
// }
int main()
{
    vector<int> time = {1, 2, 3};
    int ans = minimumTime(time, 9);
    cout << ans << endl;
    return 0;
}