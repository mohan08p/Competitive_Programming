#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

bool is_pal(int n)
{
    vector<int> v;
    while(n)
    {
        v.push_back(n%10);
        n/=10;
    }
    for(int i=0;i<v.size();++i)
        if(v[i]!= v[v.size()-1-i])
            return false;
    return true;
}

int main() 
{
    vector<int> pals;
    for(int n1=100;n1<=999;++n1)
    {
        for(int n2=100;n2<=n1;++n2)
        {
            int m=n1*n2;
            if(is_pal(m))
                pals.push_back(m);
        }
    }
    sort(pals.begin(),pals.end());
    
    int T;
    scanf("%d",&T);
    while(T--)
    {
        int N;
        scanf("%d",&N);
        int best=0;
        for(int i=0;i<pals.size();++i)
            if(pals[i]<N)
                best=max(best,pals[i]);
        printf("%d\n",best);
    }
    return 0;
}