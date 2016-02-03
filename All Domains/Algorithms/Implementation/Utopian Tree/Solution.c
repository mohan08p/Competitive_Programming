#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int t,test,total;
 
    scanf("%d",&test);
 
    while(test--){
        scanf("%d",&t);
        total=1;
        int flag=1;
        while(t--)
        {
            if(flag){
                if(total==1){
                    total+=1;
                }else{
                total*=2;
                }
            flag--;
            }
            else{
                total+=1;
                flag++;
            }
        }
        printf("%d\n",total);
    } 
    return 0;
}