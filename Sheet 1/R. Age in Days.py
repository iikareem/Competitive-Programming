#include <string>
#include <iostream>
#include<iomanip>
#include <cmath>
using namespace std;
int main()
{
	int days, Y, m, d;
	cin >> days;
	Y = days / 365;
	days = days % 365;
	m = days / 30;
	d = days % 30;
	cout << Y << " years" << endl;
	cout << m << " months" << endl;
	cout << d << " days" << endl;



	return 0;
}
 