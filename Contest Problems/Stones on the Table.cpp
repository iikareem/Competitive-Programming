
#include <iostream>

using namespace std;

int main()
{
    int x;
    std::cin >> x;
    string str;
    std::cin >> str;
    int count =0;
    for (int i = 0; i < x; i++) {
    if(str[i] == str[i+1]){
        count++;
    }
    }
    std::cout << count << std::endl;
    
    
    return 0;
}
