

#include<iostream>
#include <cmath>
#include <algorithm>



using namespace std;

int main()
{
int x;
std::cin >> x;
int arr[x];
for(int i =0; i<x; i++){
    std::cin >> arr[i];
}
sort(arr ,  arr + x);

 for (int i = 0; i < x; ++i){
        cout << arr[i] << " ";
}


    return 0;
}
