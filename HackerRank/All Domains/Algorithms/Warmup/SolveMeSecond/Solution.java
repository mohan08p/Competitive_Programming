import java.util.*;

public class Solution
{
	static int solveMeSecond(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int t;
		int sum;
		int _a, _b;
		t=input.nextInt();
		for(int i=0;i<t;i++)
		{
			_a=input.nextInt();
			_b=input.nextInt();
			sum=solveMeSecond(_a, _b);
			System.out.println(sum);
		}
	}
}