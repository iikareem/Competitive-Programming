#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    
    string str;
    int count = 1;
    std::cin >> str;
    std::sort(str.begin(), str.end());
   
    for(int i =1; i<str.length(); i++){
        if(str[i-1] != str[i]){
            count++;
        }
    }
    if(count % 2  == 0){
        std::cout << "CHAT WITH HER!" << std::endl;
    }
    else{
        std::cout << "IGNORE HIM!" << std::endl;
    }




    return 0;
}
