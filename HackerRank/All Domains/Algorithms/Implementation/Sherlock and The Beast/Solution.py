# Enter your code here. Read input from STDIN. Print output to STDOUT

def get_result(n):
    fives,threes=0,0
    for i in range(n,-1,-1):
        if not (n-i)%5 and not i%3:
            fives=i;
            threes=n-i;
            break
    if fives==0 and threes==0:
        print(-1)
    else:
        print('5'*fives+'3'*threes)
        
        
if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        get_result(int(input()))
    