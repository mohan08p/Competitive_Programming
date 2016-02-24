import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(br.readLine());
        
        int[] candy=new int[N];
        candy[0]=1;
        for(int i=1;i<N;i++)
        {
            candy[i]=1;
            if(arr[i]>arr[i-1])
                candy[i]+=candy[i-1];
            else
            {
                for(int j=i;j>0 && arr[j]<arr[j-1] && candy[j]==candy[j-1]; candy[--j]+=1)
                {}
            }
        }
        long sum=0;
        for(int i=0;i<N;i++)
            sum+=candy[i];
        System.out.println(sum);
    }
}