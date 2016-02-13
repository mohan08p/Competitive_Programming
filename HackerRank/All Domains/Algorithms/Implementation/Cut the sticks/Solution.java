import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] len=new int[n];
        List<Integer> ls=new LinkedList<Integer>();
        for(int i=0;i<n;i++)
            len[i]=input.nextInt();
        input.close();
        Arrays.sort(len);
        for(int i=0;i<n;i++)
        {
            if(len[i]==0)
                continue;
            else
            {
                ls.add(n-i);
                final int c=len[i];
                for(int j=i;j<n;j++)
                    len[j]-=c;
            }
        }
        for(int i=0;i<ls.size();i++)
            System.out.println(ls.get(i));
    }
}