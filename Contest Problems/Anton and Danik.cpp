

#include <iostream>

using namespace std;

int main()
{
    int n;
    string str;
    int a = 0;
    int d = 0;
    std::cin >> n;
    std::cin >> str;
   for(int i = 0; i<n; i++){
       if(str[i] == 'A'){
           a++;
       }
       else if(str[i] == 'D'){
           d++;
       }
   }
   if(a>d){
       std::cout << "Anton" << std::endl;
   }
   if(a<d){
       std::cout << "Danik" << std::endl;
   }
   if(a==d){
       std::cout << "Friendship" << std::endl;
   }
   
   
    
    return 0;
}
