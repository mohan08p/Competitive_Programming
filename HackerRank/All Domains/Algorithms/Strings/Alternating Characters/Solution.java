import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)throws IOException 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int temp;
        while(t-->0)
        {
            temp=0;
            String str=br.readLine();
            int len=str.length();
            char ch[]=new char[200];
            ch=str.toCharArray();
            for(int i=0;i<ch.length-1;i++)
            {
                if(ch[i]==ch[i+1])
                    temp++;
            }
            System.out.println(temp);
        }
    }
}