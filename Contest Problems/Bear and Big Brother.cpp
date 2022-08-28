

#include <iostream>

using namespace std;

int main()
{
    int l;
    int b;
    std::cin >> l;
    std::cin >> b;

    int count = 0;
    while(b>=l){
        l = l * 3;
        b = b * 2;
        count++;
    }
    std::cout << count << std::endl;
   
   
    
    return 0;
}
