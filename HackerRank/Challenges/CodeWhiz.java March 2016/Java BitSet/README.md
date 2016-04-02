 Java BitSet 
 
 Java's BitSet class implements a vector of bit values (i.e.: falsefalse (00) or truetrue (11)) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 11 is called a set bit.

Given 22 BitSets, B1B1 and B2B2, of size NN where all bits in both BitSets are initialized to 00, perform a series of MM operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

Input Format

The first line contains 22 space-separated integers, NN (the length of both BitSets B1B1 and B2B2) and MM (the number of operations to perform), respectively.
The MM subsequent lines each contain an operation in one of the following forms:

    AND  <set> <set> <set> <set>
    OR  <set> <set> <set> <set>
    XOR  <set> <set> <set> <set>
    FLIP <set> <index> <set> <index>
    SET  <set> <index> <set> <index>

In the list above, <set><set> is the integer 11 or 22, where 11 denotes B1B1 and 22 denotes B2B2.
<index><index> is an integer denoting a bit's index in the BitSet corresponding to <set><set>.

For the binary operations ANDAND, OROR, and XORXOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1

B2B2 is the left operand, and B1B1 is the right operand. This operation should assign the result of B2∧B1B2∧B1 to B2B2.

Constraints

    1≤N≤10001≤N≤1000
    1≤M≤100001≤M≤10000

Output Format

After each operation, print the respective number of set bits in BitSet B1B1 and BitSet B2B2 as 22 space-separated integers on a new line.

Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output

0 0
1 0
1 1
1 2

Explanation

Initially: N=5N=5, M=4M=4, B1={0,0,0,0,0}B1={0,0,0,0,0}, and B2={0,0,0,0,0}B2={0,0,0,0,0}. At each step, we print the respective number of set bits in B1B1 and B2B2 as a pair of space-separated integers on a new line.

M0=AND 1 2M0=AND 1 2
B1=B1∧B2={0,0,0,0,0}∧{0,0,0,0,0}={0,0,0,0,0}B1=B1∧B2={0,0,0,0,0}∧{0,0,0,0,0}={0,0,0,0,0}
B1={0,0,0,0,0}B1={0,0,0,0,0}, B2={0,0,0,0,0}B2={0,0,0,0,0}
The number of set bits in B1B1 and B2B2 is 00.

M1=SET 1 4M1=SET 1 4
Set B1[4]B1[4] to truetrue (11).
B1={0,0,0,0,1}B1={0,0,0,0,1}, B2={0,0,0,0,0}B2={0,0,0,0,0}.
The number of set bits in B1B1 is 11 and B2B2 is 00.

M2=FLIP 2 2M2=FLIP 2 2
Flip B2[2]B2[2] from falsefalse (00) to truetrue (11).
B1={0,0,0,0,1}B1={0,0,0,0,1}, B2={0,0,1,0,0}B2={0,0,1,0,0}.
The number of set bits in B1B1 is 11 and B2B2 is 11.

M3=OR 2 1M3=OR 2 1
B2=B2∨B1={0,0,1,0,0}∨{0,0,0,0,1}={0,0,1,0,1}B2=B2∨B1={0,0,1,0,0}∨{0,0,0,0,1}={0,0,1,0,1}.
B1={0,0,0,0,1}B1={0,0,0,0,1}, B2={0,0,1,0,1}B2={0,0,1,0,1}.
The number of set bits in B1B1 is 11 and B2B2 is 22.