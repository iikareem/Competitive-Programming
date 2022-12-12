#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;
    string str;
    map<string , int> mp;
    for (int i = 0; i < t; ++i) {
        cin>>str;
        if (mp[str]==0){
            mp[str]=1;
            cout<<"OK"<<endl;}
        else{
            cout<<str<<mp[str]<<endl;
            mp[str]++;
        }
    }



    return 0;
}