 Java List 
 
 For this problem, we have 22 types of queries you can perform on a List:

    Insert yy at index xx:

    Insert
    x y

    Delete the element at index xx:

    Delete
    x

Given a list, LL, of NN integers, perform QQ queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, NN (the initial number of elements in LL).
The second line contains NN space-separated integers describing LL.
The third line contains an integer, QQ (the number of queries).
The 2Q2Q subsequent lines describe the queries, and each query is described over two lines:

    If the first line of a query contains the String Insert, then the second line contains two space separated integers x yx y, and the value yy must be inserted into LL at index xx.
    If the first line of a query contains the String Delete, then the second line contains index xx, whose element must be deleted from LL.

Constraints

    1≤N≤40001≤N≤4000
    1≤Q≤40001≤Q≤4000
    Each element in is a 32-bit integer.

Output Format

Print the updated list LL as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23

Explanation

L=[12,0,1,78,12]L=[12,0,1,78,12]

Q0: Q0:  Insert 23 at index 55.
L0=[12,0,1,78,12,23]L0=[12,0,1,78,12,23]

Q1: Q1:  Delete the element at index 00.
L1=[0,1,78,12,23]L1=[0,1,78,12,23]

Having performed all QQ queries, we print L1L1 as a single line of space-separated integers.