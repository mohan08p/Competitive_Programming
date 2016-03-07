 import java.io.*;  
 import java.util.*;  
 import java.text.*;  
 import java.math.*;  
 import java.util.regex.*;  
 public class Solution
 {  
   public static void main(String[] args) 
   {  
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  
     Scanner input = new Scanner(System.in);  
     int t;  
     t = input.nextInt();  
     while((t--)>0)
     {  
       Long l = input.nextLong();  
       String s1="",s2="";  
       String s = Long.toBinaryString(l);  
       for(int i = 0,j = s.length()-1;i<32;i++)
       {  
         if(j>=0 && s.charAt(j) =='1')  
           s1 = s1 + "0";  
         else  
           s1 = s1 + "1";   
         j--;    
       }  
       for(int i = 31;i>=0;i--)
         s2 = s2+s1.charAt(i);  
       String bin = s2;  
       long number = 0;  
       int dig;  
       for (int i = 0; i < bin.length(); i++)
       {  
        dig = bin.charAt(i) - '0';  
        number = 2 * number + dig;  
       }  
       System.out.println( Long.toString(number));  
     }  
   }  
 }  