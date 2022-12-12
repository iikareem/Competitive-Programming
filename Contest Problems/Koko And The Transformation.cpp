#include <iostream>
using namespace std;

int main() {
    int n,m;
    cin>>n>>m;
    int A[n];
    int B[m];


    int SumOfA=0;
    int SumOfB=0;


    for (int i = 0; i < n; ++i) {
        cin>>A[i];
        SumOfA += A[i];
    }

    for (int i = 0; i < m; ++i) {
        cin>>B[i];
        SumOfB +=B[i];
    }

    if (SumOfA==SumOfB){
        cout<<"Yes";
    } else{
        cout<<"No";

    }





    return 0;
}