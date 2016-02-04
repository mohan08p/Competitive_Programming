__author__ = 'mohan08p'
#To change this template use Tools | Templates.
# Enter your code here. Read input from STDIN. Print output to STDOUT
if __name__=='__main__':
    t=input()
    for _ in xrange(t):
        a=input()
        count=0
        for i in list(str(a)):
            if int(i) != 0 and a % int(i)==0:
                count+=1
        print count