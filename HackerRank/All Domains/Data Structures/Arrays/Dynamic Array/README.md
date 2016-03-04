Dynamic Array

There are NN sequences. All of them are initially empty, and you are given a variable lastans=0lastans=0. You are given QQ queries of two different types:

    "11 xx yy" - Insert yy at the end of the ((x⊕lastansx⊕lastans) mod NN)th sequence.
    "22 xx yy" - Print the value of the (yy mod sizesize)th element of the ((x⊕lastansx⊕lastans) mod NN)th sequence. Here, sizesize denotes the size of the related sequence. Then, assign this integer to lastanslastans.

Note: You may assume that, for the second type of query, the related sequence will not be an empty sequence. Sequences and the elements of each sequence are indexed by zero-based numbering.

The ⊕⊕ symbol denotes the xor operation. You can get more information about it from Wikipedia. It is defined as ^
^
in most of the modern programming languages.

Input Format

The first line consists of NN, number of sequences, and QQ, number of queries, separated by a space. The following QQ lines contains one of the query types described above.

Constraints
1≤N,Q≤1051≤N,Q≤105
0≤x≤1090≤x≤109
0≤y≤1090≤y≤109

Output Format

For each query of type two, print the answer on a new line.

Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1

Sample Output

7
3

Explanation

The first sequence is 5,35,3 and the second sequence is 77.