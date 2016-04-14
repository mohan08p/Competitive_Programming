import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        byte T=input.nextByte();
        for(int i=0;i<T;i++)
        {
            long B=input.nextLong();
            long W=input.nextLong();
            long x=input.nextLong();
            long y=input.nextLong();
            long z=input.nextLong();
            long costB=B*x;
            long costW=W*y;
            if(x==y)
            {
                System.out.println(costB+costW);
                continue;
            }
            else if(x<y)
            {
                if((x+z)<y)
                    System.out.println((W*x)+(W*z)+costB);
                else
                {
                    System.out.println(costB+costW);
                    continue;
                }
            }
            else
            {
                if((y+z)<x)
                    System.out.println((B*y)+(B*z)+costW);
                else
                    System.out.println(costB+costW);
            }
        }
    }
}