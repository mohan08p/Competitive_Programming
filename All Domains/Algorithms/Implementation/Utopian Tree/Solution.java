import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,test,total;
		Scanner input=new Scanner(System.in);
		test=input.nextInt();
		while(test-->0)
		{
			t=input.nextInt();
			total=1;
			int flag=1;
			while(t-->0)
			{
				if(flag==1)
				{
					if(total==1)
						total+=1;
					else
						total*=2;
					flag--;
				}
				else
				{
					total+=1;
					flag++;
				}
			}
			System.out.println(total);
		}

    }
}