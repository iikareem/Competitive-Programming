#include <iostream>
using namespace std;
 
int main() {
    // Write C++ code here
    long long number,index,mid;
    
    cin >> number >> index;
    
    mid = number / 2;
 
    if(number % 2 != 0){
        mid = mid +1;}
        
    if(index<=mid){
        cout << (((index - 1)*2)+1);
    }   
    else {
        cout << ((index - mid)*2);
 
    }
    
    
 
    return 0;
}