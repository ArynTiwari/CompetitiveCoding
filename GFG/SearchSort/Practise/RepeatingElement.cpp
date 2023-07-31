#include <bits/stdc++.h>
using namespace std;
int repeat(int arr[], int n)
{
	int slow = arr[0]+1, fast = arr[0]+1;

	do{
		slow = arr[slow]+1;
		fast = arr[arr[fast]+1]+1;
	
	}while(slow != fast);
	
	slow = arr[0]+1;

	while(slow != fast)
	{
		slow = arr[slow]+1;
		fast = arr[fast]+1;
	}
	return slow-1;
}
int main()
{
    int n = 5;
    int arr[n] = {0, 3, 1, 3, 2, 2};
    cout << repeat(arr, n);
    cout << endl;
    return 0;
} 