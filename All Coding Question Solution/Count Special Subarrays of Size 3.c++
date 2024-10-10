Count Special Subarrays of Size

You are given an array of integers containing N elements. Your task is to find and return an integer value representing the total number of subarrays of size 3 
such that the sum of the first element and the third element is equal to the second element.
  
Input:
An integer N representing the size of the array.
An integer array representing the elements of the array.

Output:
Return an integer representing the total number of subarrays of size 3 where the sum of the first and third elements is equal to the second element.

N= 6
Arr = [1, 2, 1, 5, 6, 5] 
output= 1


#include <iostream>
#include <vector>

using namespace std;

int countSpecialSubarrays(const vector<int>& arr) {
    int count = 0;
    int n = arr.size();

    for (int i = 0; i < n - 2; i++) {
        if (arr[i] + arr[i + 2] == arr[i + 1]) {
            count++;
        }
    }

    return count;
}

int main() {
    vector<int> arr = {1, 2, 1, 6, 5, 5};

    cout << countSpecialSubarrays(arr) << endl;  // Output: 2

    return 0;
}
