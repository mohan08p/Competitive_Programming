#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int N;
    scanf("%d",&N);
    long long arr[N];
    int i;
    for(i=0;i<N;i++)
        scanf("%lld",&arr[i]);
    long long sum=0;  
    for(i=0;i<N;i++)
    {
        sum+=arr[i];
    }
    printf("%lld",sum);
    return 0;
}