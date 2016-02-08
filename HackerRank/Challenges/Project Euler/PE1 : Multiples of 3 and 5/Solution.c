#include <stdio.h>

int main() {

    int t;
    long long int n,m,c,sum;
    
    scanf("%d",&t);
    
    if(t>0 && t<=9999)
    {
        for(c=0;c<t;c++)
        {
            scanf("%lli",&n);
            if(n>0 && n<=9999)
            {
                sum=0;
                for(m=1;m<n;m++)
                {
                    if(m%3==0 || m%5==0 && m%15!=0)
                        sum+=m;
                }
                printf("%lli\n",sum);
            }    
        }
    }
    
    return 0;
}
