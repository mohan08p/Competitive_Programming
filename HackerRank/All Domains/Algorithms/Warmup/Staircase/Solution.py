# Enter your code here. Read input from STDIN. Print output to STDOUT

def printStairCase(levels):
    for i in xrange(1,levels+1):
        print ("#" *i).rjust(levels)

if __name__=='__main__':
    t=input()
    printStairCase(t)