import java.util.*;
import java.io.*;

public class Solution
{
	static int solveMeFirst(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int sum;
		sum=solveMeFirst(a, b);
		System.out.println(sum);
	}
}