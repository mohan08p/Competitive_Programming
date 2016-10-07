import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0; i<n;i++)
            arr[i]=sc.nextLong();
        
        long[][] table=new long[val+1][n];
        for(int i=0;i<n;i++)
            table[0][i]=1;
        
        for(int i=1;i<val+1;i++)
            {
            for(int j=0;j<n;j++)
                {
                long x = (i-(int)arr[j] >= 0)? table[i - (int)arr[j]][j]: 0;
 
            
            long y = (j >= 1)? table[i][j-1]: 0;

            table[i][j] = x + y;
            }
        }
        System.out.println(table[val][n-1]);
    }
}
