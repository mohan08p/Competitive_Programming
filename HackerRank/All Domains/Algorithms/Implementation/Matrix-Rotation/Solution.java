import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        
        int r=sc.nextInt();
        
        int[][] arr=new int[row][col];
        
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
            
        int n=row>col?col:row;
        n=n/2;
        
        int current=0,prev=0,temp=0;
        
        for(int i=0;i<n;i++)
            {
              int c=r%(2*(row+col-2-4*i)); //calculates the number of roatations
            //System.out.println(c);
             for(int x=1;x<=c;x++)
             {
                 
                 // first row
                 int u=arr[i][i];
                  prev=arr[i][col-i-1];
               for(int j=col-i-2;j>=i;j--)
                   {
                    current=arr[i][j];
                   arr[i][j]=prev;
                   prev=current;
                  
               }
                 
                 // left column
                 
                 int v=arr[row-i-1][i];
                 prev=arr[i+1][i];
                 for(int j=i+2;j<row-i;j++)
                     {
                      current=arr[j][i];
                     arr[j][i]=prev;
                    prev=current;
                     
                 }
                 arr[i+1][i]=u;
                 
                 // bottom row
                int w=arr[row-i-1][col-i-1];
                 
                 prev=arr[row-i-1][i+1];
                 for(int j=i+2;j<col-i;j++)
                     {
                     current=arr[row-i-1][j];
                     arr[row-i-1][j]=prev;
                     prev=current;
                 }
                 
                 arr[row-i-1][i+1]=v;
                
                 // right column
                 prev=w;
                 
                for(int j=row-i-2;j>=i;j--)
                    {
                    current=arr[j][col-i-1];
                    arr[j][col-i-1]=prev;
                    prev=current;
                }
                 arr[row-i-2][col-i-1]=w;
                 
           
                
            
        }
        }
       
        // print the matrix
        
        for(int i=0;i<row;i++)
           {
            for(int j=0;j<col;j++)
                {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
