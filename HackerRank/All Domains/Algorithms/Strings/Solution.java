import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)throws IOException
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        final char[] ch=br.readLine().toLowerCase().toCharArray();
        
        final int N=ch.length;
        boolean isPangram=false;
        final int alpha_len='z'-'a'+1;
        if(N>=alpha_len)
        {
            int count=0;
            final boolean[] alpha=new boolean[alpha_len];
            for(int i=N-1;i>=0;--i)
            {
                char c=ch[i];
                if(c>='a'&& c<='z' && !(alpha[c-='a']))
                {
                    alpha[c]=true;
                    if(++count>=alpha_len)
                    {
                        isPangram=true;
                        break;
                    }
                }
            }
        }
        System.out.println(isPangram ? "pangram" : "not pangram");
    }
}