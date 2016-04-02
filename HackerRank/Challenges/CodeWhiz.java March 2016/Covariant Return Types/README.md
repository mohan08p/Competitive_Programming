 Covariant Return Types 
 
 Java allows for Covariant Return Types, which means you can vary your return type as long you are returning a subclass of your specified return type.

Method Overriding allows a subclass to override the behavior of an existing superclass method and specify a return type that is some subclass of the original return type.

Note: It is best practice to use the @Override annotation when overriding a superclass method.

Write the classes and methods detailed in the diagram below:

[MethodOverriding.png]

We will append a hidden SolutionSolution class to test your code; the mainmain method in our test class takes the name of a state as input and prints the national flower of that state using the classes and methods you written by you.

Resources
Covariant Return Type
Java Covariant Type

Input Format

Input is handled for you by the hidden SolutionSolution test class.

Output Format

Output is handled for you by the hidden SolutionSolution test class.

Sample Input

A single line containing the name of a State:

AndhraPradesh

Sample Output

A single line containing the national flower of the State received as input:

Lily
