import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        int flag=0;
        for(int t=0;t<T;t++)
        {
            String s=input.next();
            char[] ch=s.toCharArray();
            int n=ch.length;
            int x=n-1;
            for(int i=0;i<ch.length-1;i++,x--)
            {
                flag=0;
                int a=ch[i+1]-ch[i];
                if(a<0)
                    a*=-1;
                int b=ch[x-1]-ch[x];
                if(b<0)
                    b*=-1;
                if(a==b)
                    flag=1;
                else
                    break;
            }
            if(flag==1)
                System.out.println("Funny");
            else
                System.out.println("Not Funny");
        }
    }
}