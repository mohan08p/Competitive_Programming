import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        long N=input.nextLong();
        int T=input.nextInt();
        int[] width=new int[(int)N];
        for(int a=0;a<N;a++)
            width[a]=input.nextInt();
        for(int a=0;a<T;a++)
        {
            int i=input.nextInt();
            int j=input.nextInt();
            int[] res=new int[j-i+1];
            int p=0;
            for(int b=i;b<=j;b++)
            {
                res[p]=width[b];
                p++;
            }
            Arrays.sort(res);
            System.out.println(res[0]);
        }
    }
}