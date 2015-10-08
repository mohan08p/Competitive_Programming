import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;++i)
            arr[i]=input.nextInt();
        float fp=0,fn=0,fz=0;
        for(int i=0;i<N;++i)
        {
            if(arr[i]>0)
                fp+=1.0;
            else if(arr[i]<0)
                fn+=1.0;
            else
                fz+=1.0;
        }
        DecimalFormat df=new DecimalFormat("#.###");
        System.out.println(df.format(fp/(float)N));
        System.out.println(df.format(fn/(float)N));
        System.out.println(df.format(fz/(float)N));
    }
}