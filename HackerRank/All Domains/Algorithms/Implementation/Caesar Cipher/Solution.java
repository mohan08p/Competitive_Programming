import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        String s=input.next();
        char[] ch=s.toCharArray();
        int K=input.nextInt();
        for(int i=0;i<ch.length;++i)
        {
            if(ch[i]>='A' && ch[i]<='Z')
                System.out.print((char)((ch[i]-'A'+K)%26+'A'));
            else if(ch[i]>='a' && ch[i]<='z')
                System.out.print((char)((ch[i]-'a'+K)%26+'a'));
            else
                System.out.print(ch[i]);
        }
    }
}