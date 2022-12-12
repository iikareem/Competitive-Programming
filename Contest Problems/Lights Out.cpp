#include <iostream>
 
using namespace std;
int lights[3][3];
void check(int i,int j,int x){
 
    lights[i][j] += x;
    if (j+1<3){
        lights[i][j+1] +=x;
    }
    if (j-1>-1){
        lights[i][j-1] +=x;
    }
    if (i+1<3){
        lights[i+1][j] +=x;
    }
    if (i-1>-1){
        lights[i-1][j] +=x;
    }
 
}
int main() {
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            int x;
            cin>>x;
            check(i,j,x);
        }
    }
    for (int i = 0; i < 3; ++i) {
        for (int j = 0; j < 3; ++j) {
            if (lights[i][j]%2==0){
                cout<<"1";
            } else{
                cout<<"0";
            }
        }
        cout<<endl;
    }
    return 0;
}