T=int(input())
for i in range(T):
    N=int(input())
    a,b,s=1,2,0
    while b<=N:
        if b%2==0: s+=b
        a,b=b,a+b
    print(s)