#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int arr[500][500],n,m,i,j,k,problem=0,team=0;
    char val[600][600];
    cin>>n>>m;
    for(i=0;i<n;i++)
        cin>>val[i];
    int tproblem=0,tteam=0,flag=0;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            flag=0;
            tproblem=0;
            for(k=0;k<m;k++)
            {
                int x,y;
                x=val[i][k]-48;
                y=val[j][k]-48;
                if(x|y)
                    tproblem++;
            }
            if(tproblem==problem)
                tteam++;
            if(tproblem>problem)
            {
                problem=tproblem;
                tteam=1;
            }
        }
    }
    cout<<problem<<endl<<tteam<<endl;
    return 0;
}