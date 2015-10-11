#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
    string str;
    cin>>str;
    int val=(str[0]-'0')*10+(str[1]-'0');
    if(str[8]=='A')
    {
        if(val==12)
            val=0;
    }
    else
    {
        val+=12;
        if(val==24)
            val=12;
    }
    printf("%02d",val);
    cout<<str.substr(2,6)<<endl;
    return 0;
}
