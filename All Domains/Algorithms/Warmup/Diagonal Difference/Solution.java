import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int[] arr=new  int[N*N];
        for(int i=0;i<arr.length;++i)
            arr[i]=input.nextInt();
        int sum1=0,sum2=0;
        
        for(int i=0,j=N-1;i<arr.length;i+=N+1,j+=N-1)
        {
            sum1+=arr[i];
            sum2+=arr[j];
        }
        System.out.println(Math.abs(sum2-sum1));
    }
}