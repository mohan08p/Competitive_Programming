import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            a[i]=input.nextInt();
        for(int i=0;i<n;i++)
            sum+=a[i];
        System.out.println(sum);
    }
}