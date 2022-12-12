
#include <iostream>

using namespace std;

int main()
{
int n,h,x;
int sum =0;
std::cin >> n;
std::cin >> h;
    for(int i =1; i<=n; i++){
    std::cin >> x;
        if(x > h){
        sum = sum +2;    
        }
        else if(x <= h){
            sum = sum +1;
        }
    }
    std::cout << sum << std::endl;
    return 0;
}
