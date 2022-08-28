

#include <iostream>

using namespace std;

int main()
{
    int num;
    std::cin >> num;
    int p,v,t;
    int sure =0;
    for(int i=1; i<=num; i++){
        std::cin >> p;
        std::cin >> v;
        std::cin >> t;
        if((p && v == 1) || p && t == 1 || v && t == 1){
            sure++;
        }

    }
    std::cout << sure << std::endl;
    return 0;
}
