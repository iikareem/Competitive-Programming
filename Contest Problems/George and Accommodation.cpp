#include <iostream>
using namespace std;

int main() {
   int t,count=0;
   cin>>t;
    while (t--){
     int people,room;
     cin >>people>>room;
        if (room-people >=2){
            count++;
        }
    }
    cout<<count;

    return 0;
}