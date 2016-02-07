import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int flag=0;
        for(int i=2;i<6;i++)
            if(N==i)
                flag=1;
        if(N%2==1)
            System.out.println("Weird");
        else
        {
           if(N>=2 && N<=5) 
               System.out.println("Not Weird");
            else if(N>=6 && N<=20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        }
    }
}