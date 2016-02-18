#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
    int N,K;
    string s;
    cin>>N>>s>>K;
    for(int i=0;i<N;i++)
    {
        if(s[i]>='A' && s[i]<='Z')
            cout<<(char)((s[i]-'A'+K)%26+'A');
        else if(s[i]>='a' && s[i]<='z')
            cout<<(char)((s[i]-'a'+K)%26+'a');
        else
            cout<<s[i];
    }
    return 0;
}
