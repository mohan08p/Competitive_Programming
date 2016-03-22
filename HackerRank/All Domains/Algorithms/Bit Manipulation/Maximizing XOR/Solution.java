import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{
    static int maxXor(int l, int r) 
    {
        int answer=0,temp=0;
        for(int i=l;i<=r;i++)
        {
            for(int j=l;j<=r;j++)
            {
                temp=(i|j) & ~(i&j);
                if(answer<temp)
                    answer=temp;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(input.nextLine());
        
        int _r;
        _r = Integer.parseInt(input.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);        
    }
}
