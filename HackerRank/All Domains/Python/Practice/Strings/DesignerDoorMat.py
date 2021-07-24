# Designer Door Mat

# Enter your code here. Read input from STDIN. Print output to STDOUT
N,M = map(int,input().split())
c = ".|."
for i in range(N//2):
    print((c*((i*2)+1)).center(M, '-'))
print(('WELCOME'.center(M,'-')))
for j in range(N//2):
    print((c*((N-(j*2))-2)).center(M, '-'))
