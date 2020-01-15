#include <stdio.h>
#include <string>
#include <iostream>
#include <algorithm>
using namespace std;

string sum(string a, string b)
{
    cout << "sum= " << a << ' ' <<  b << endl;
    reverse(a.begin(), a.end());
    reverse(b.begin(), b.end());
    while(a.size() < b.size())
    {
        a.push_back('0');
    }
    while(b.size() < a.size())
    {
        b.push_back('0');
    }
    int carry = 0;
    string d;
    for(int i = 0; i < a.size(); i++)
    {
        int c = carry + a[i] - '0' + b[i] - '0';
        carry = c / 10;
        c = c % 10;
        d.push_back(c + '0');
    }
    if(carry > 0) d.push_back(carry + '0');
    reverse(d.begin(), d.end());
}
int main()
{
    string a, b;
    cin >> a, b;

    cout << sum(a, b);
    return 0;
}
