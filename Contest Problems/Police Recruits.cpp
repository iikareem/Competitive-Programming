#include <iostream>
 
using namespace std;
 
int main()
{
    int n,s,sum = 0, counter = 0;
    std::cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        if(s > 0){
            sum += s;
        }
        else {
            if(sum == 0){
                counter++;
            }
            else {
                sum--;
            }
        }
        
        
    }
    std::cout << counter << std::endl;
    
    
    
    
    return 0;
}