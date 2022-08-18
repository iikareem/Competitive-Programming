#include <string>
#include <iostream>
#include<iomanip>
#include <cmath>
using namespace std;
int main()
{
	int a, b,r;
	char s;
	cin >> a >> s >> b;
	if (s =='+') {
		r = a + b;
		cout << r;
	}
	else if (s == '-') {
		r = a - b;
		cout << r;
	}
	else if (s == '*') {
		r = a * b;
		cout << r;
	}
	else {
		r = a / b;
		cout << r;
	}
	
 
 
	return 0;
}