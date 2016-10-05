import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    static int max(int x,int y)
    {
        return (y>x)?y:x;
    }
    static int maxSubarrayContinuousC(int[] arr,int indexMax)
    {
        int tempMax=arr[0];
        int currMax=arr[0];
        for(int i=1;i<indexMax;i++)
        {
            currMax=max(arr[i],currMax+arr[i]);
            tempMax=max(tempMax,currMax);
        }
        return tempMax;
    }
    static int maxSubarrayContinuousNC(int[] arr,int indexMax)
    {
        int sumMax=0;
        int max=arr[0];
        boolean negArray=true;
        int res=0;
        for(int i=0;i<indexMax;i++)
        {
            if(arr[i]>=0)
            {
                sumMax+=arr[i];
                negArray=false;
            }
            if(arr[i]>=max)
                max=arr[i];
        }
        if(negArray==false)
            res=sumMax;
        if(negArray)
            res=max;
        
        return res;
    }
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int[] testSolutionC=new int[10];
        int[] testSolutionNC=new int[10];
        int resC,resNC;
        int T;
        T=Integer.parseInt(input.nextLine());
        for(int i=0;i<T;i++)
        {
            String inputString;
            int[] arr=new int[100000];
            int indexMax=Integer.parseInt(input.nextLine());
            inputString=input.nextLine();
            int arrIndex=0;
            StringTokenizer st=new StringTokenizer(inputString);
            while(st.hasMoreTokens())
            {
                arr[arrIndex]=Integer.parseInt(st.nextToken());
                arrIndex++;
            }
            resC=maxSubarrayContinuousC(arr,indexMax);
            resNC=maxSubarrayContinuousNC(arr,indexMax);
            testSolutionC[i]=resC;
            testSolutionNC[i]=resNC;
        }
        for(int i=0;i<T;i++)
        {
            System.out.print(testSolutionC[i]+" ");
            System.out.print(testSolutionNC[i]);
            System.out.println();
        }
    }
}