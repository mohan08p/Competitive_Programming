__author__ = 'mohan08p'
#To change this template use Tools | Templates.

# Enter your code here. Read input from STDIN. Print output to STDOUT
from datetime import date

def calHackos(actual,expect):
    actual_date=date(actual[2],actual[1],actual[0])
    expect_date=date(expect[2],expect[1],expect[0])
    
    if actual_date.year>expect_date.year: return 10000
    if actual_date.year<expect_date.year: return 0
    if actual_date.month>expect_date.month: return (actual_date.month-expect_date.month)*500
    if actual_date.month<expect_date.month: return 0
    if actual_date.day>expect_date.day: return (actual_date.day-expect_date.day)*15
    return 0

if __name__=='__main__':
    actual=map(int,raw_input().split())
    expect=map(int,raw_input().split())
    print calHackos(actual,expect)