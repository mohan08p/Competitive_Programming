import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        byte T=input.nextByte();
        for(int i=0;i<T;i++)
        {
            int stime=input.nextInt();
            int etime=input.nextInt();
            int[] values=new int[10];
            for(int j=0;j<10;j++)
                values[j]=input.nextInt();
            for(int seed=stime;seed<etime;seed++)
            {
                Random rand=new Random(seed);
                boolean b=false;
                for(int j=0;j<values.length;j++)
                {
                    if(rand.nextInt(1000)!=values[j])
                    {
                        b=true;
                        break;
                    }
                }
                if(!b)
                {
                    System.out.print(seed);
                    System.out.print(" ");
                    for(int j=0;j<10;j++)
                    {
                        System.out.print(rand.nextInt(1000));
                        System.out.print(" ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}
