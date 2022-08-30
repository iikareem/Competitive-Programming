#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
#include <cctype>
#include <cstring>

using namespace std;

int main()
{
    
    string str;
    std::cin >> str;
    int l = 0;
    int u = 0;
    for(int i =0; i<str.length(); i++){
        if(isupper(str[i])){
            u++;
        }
        if(islower(str[i])){
            l++;
        }
    }
    if(u>l){
        for(int i =0; i<str.length(); i++){
            str[i] = toupper(str[i]);
        }
    }
    if (u<=l){
        for(int i =0; i<str.length(); i++){
            str[i] = tolower(str[i]);
        }
    }
    
    std::cout << str << std::endl;





    return 0;
}
