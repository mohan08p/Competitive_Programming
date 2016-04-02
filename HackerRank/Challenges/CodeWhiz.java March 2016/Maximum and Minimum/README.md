 Maximum and Minimum 
 
 The locked code in your editor passes array AA (of size NN) and index ii to the print method, whose try block attempts to print element A[i]A[i]; if ii is Out-of-Range, an Array Index Out Of Bounds Exception is thrown.

Complete the code in your editor so that it prints the maximum and minimum elements in array AA—regardless of whether or not an exception is thrown.

Input Format

The first line contains an integer, NN, the number of elements in AA.
The second line contains NN space-separated integers describing AA.
The third line contains an index, ii, to be accessed.

Note: Input from stdin handled by the locked code in the editor.

Constraints

    1≤N≤1001≤N≤100
    −1000≤Aj≤1000 where 1≤j≤N−1000≤Aj≤1000 where 1≤j≤N

Output Format

The try block will print the value accessed at A[i]A[i]; if an Exception is thrown, it will be printed by the locked code in your editor.
You must print the respective maximum and minimum values in array AA as a single pair of space-separated integers on a new line—regardless of whether an exception is thrown.

Note: Observe that your max/min values may print on either the first or second line, depending on whether or not an Exception was thrown!

Sample Input 0

12
-12 0 1 -899 23 45 96 10 75 23 0 33
100

Sample Output 0

96 -899
java.lang.ArrayIndexOutOfBoundsException

Sample Input 1

10
4 908 -05 445 -208 325 -2 -718 863 400
9   

Sample Output 1

400
908 -718

Explanation

Sample 0:
N=12N=12, i=100i=100, maximum(A)=96maximum(A)=96, and minimum(A)=−899minimum(A)=−899
AA's indices range from 00 to 1111, so attempting to access index 100100 throws an Exception. The maximum and minimum values in the array are printed on a new line as a pair of space-separated integers. The program's control flow then returns to main where the the Exception is caught and printed on a new line.

Sample 1:
N=10N=10, i=9i=9, maximum(A)=908maximum(A)=908, and minimum(A)=−718minimum(A)=−718
AA's indices range from 00 to 99, so an attempt to access index 99 will be successful and the value at A[9]A[9] (i.e.: 400400) is printed on a new line. The program's control flow then proceeds to print the maximum and minimum values in AA as a pair of space-separated integers on a new line.