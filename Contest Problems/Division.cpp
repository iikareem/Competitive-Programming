#include <iostream>
#include <algorithm>
#include <cstdlib>
 
 
using namespace std;
 
int main()
{
int t;
cin >>t;
int number;
while(t--){
    cin >> number;
    if(number <=1399){
        cout << "Division 4"<< endl;}
        
    else if(number >= 1400 && number <= 1599){
         cout << "Division 3"<< endl;
    }    
    else if(number >= 1600 && number <= 1899 ){
         cout << "Division 2"<< endl;
    }
    else if(number >= 1900 ){
         cout << "Division 1"<< endl;
    }
    
 
}
return 0;
 
}