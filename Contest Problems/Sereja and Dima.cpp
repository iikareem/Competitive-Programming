#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
#include <cctype>
#include <cstring>

using namespace std;

int main()
{
    
    int n;
    std::cin >> n;
    int arr[n];
    for(int i =0; i<n; i++){
        std::cin >> arr[i];
    }
    
int s = 0;
int d = 0;
int l =0;
int r = n -1;
bool p = true;

    while(l<=r){
        if(arr[l] >= arr[r]){
            if(p){
                s += arr[l];
            }
            else{
                d += arr[l];
            }
            l++;
        }
        else if(arr[r]>arr[l]){
            if(p){
                s += arr[r];
                }
            else{
                d += arr[r];
            }   
            r--;
        }
        
            if(p)
                p=false;
            else
                p=true;
        
    }
cout<<s<<" "<<d;


    




    return 0;
}
