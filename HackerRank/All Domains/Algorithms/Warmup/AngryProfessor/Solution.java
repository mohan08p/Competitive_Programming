import java.util.Scanner;

public class AngryProfessor 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		byte T=input.nextByte();
		while(T-->0)
		{
			int N=input.nextInt();
			int K=input.nextInt();
			int[] a=new int[N];
			for(int i=0;i<N;i++)
				a[i]=input.nextInt();
			int t=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]<=0)
					t++;		
			}
			if(t<K)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}