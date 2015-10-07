# Enter your code here. Read input from STDIN. Print output to STDOUT
def getDiagonaldiff(v):
    diff=0
    v_len=len(v)
    for i in xrange(v_len):
        diff+=v[i][i]
        diff-=v[i][v_len-i-1]
    return abs(diff)

if __name__=='__main__':
    t=input()
    v=[]
    for _ in xrange(t):
        e=map(int,raw_input().split())
        v.append(e)
        
    print getDiagonaldiff(v)