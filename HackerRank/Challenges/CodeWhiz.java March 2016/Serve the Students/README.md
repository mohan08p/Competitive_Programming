 Serve the Students 
 
 In this problem, there are 22 types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

    The student having the highest Cumulative Grade Point Average (CGPA) is served first.
    Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
    Any students having the same CGPA and name will be served in ascending token order.

Given a sequence of nn events, print the names of students who are yet to be served(based on above criteria). If the queue is empty, print EMPTY.

Input Format

The first line of input contains an integer, nn, denoting the total number of events. Each of the nn subsequent lines will be of the following two forms:

    ENTER name CGPA token - The student to be inserted into the priority queue.
    SERVED - The highest priority student in the queue was served.

Constraints

    2≤n≤10002≤n≤1000
    0≤CGPA≤4.000≤CGPA≤4.00 where CGPA∈RCGPA∈R
    1≤tokeni≤1051≤tokeni≤105 where each token i is a unique integer.
    2≤|name|≤302≤|name|≤30

Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all nn events; if every student in the queue was served, then print EMPTY.

Sample Input

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Sample Output

Dan
Ashley
Shafaet
Maria

Explanation

Let's call our queue QQ.

n0n0: We add John to the empty queue.
Q0={(John, 3.75, 50)}Q0={(John, 3.75, 50)}

n1n1: We add Mark to the queue; Q1={(John, 3.75, 50),(Mark, 3.8, 24)Q1={(John, 3.75, 50),(Mark, 3.8, 24)}

n2n2: We add Shafaet to the queue; Q2={(John, 3.75, 50),(Mark, 3.8, 24),(Shafaet, 3.7, 35)}Q2={(John, 3.75, 50),(Mark, 3.8, 24),(Shafaet, 3.7, 35)}

n3n3: Mark is served as he has the highest CGPA; P3={(John, 3.75, 50),(Shafaet, 3.7, 35)}P3={(John, 3.75, 50),(Shafaet, 3.7, 35)}

n4n4: John is served next as he has the highest CGPA; P4={(Shafaet, 3.7, 35)}P4={(Shafaet, 3.7, 35)}

n5n5: We add Samiha to the queue;
Q2={(Shafaet, 3.7, 35),(Samiha, 3.85, 36)}Q2={(Shafaet, 3.7, 35),(Samiha, 3.85, 36)}

n6n6: Samiha is served as she has the highest CGPA; P6={(Shafaet, 3.7, 35)}P6={(Shafaet, 3.7, 35)}

n7n7 through n10n10, the next four students are added giving us:
Q10={(Shafaet, 3.7, 35),(Ashley, 3.9, 42),(Maria, 3.6, 46),(Anik, 3.95, 49),(Dan, 3.95, 50)}Q10={(Shafaet, 3.7, 35),(Ashley, 3.9, 42),(Maria, 3.6, 46),(Anik, 3.95, 49),(Dan, 3.95, 50)}

n11n11: Anik is served because though both Anil and Dan have the highest CGPA but Anik comes first when sorted in alphabetic order; P11={(Dan, 3.95, 50),(Ashley, 3.9, 42),(Shafaet, 3.7, 35),(Maria, 3.6, 46)}P11={(Dan, 3.95, 50),(Ashley, 3.9, 42),(Shafaet, 3.7, 35),(Maria, 3.6, 46)}

As all events are completed, we print names of each remaining students on a new line.