import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        final StringBuffer sb=new StringBuffer();
        final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int T=Integer.parseInt(br.readLine());T>0;T--)
        {
            final char[] W=br.readLine().toCharArray();
            final int N=W.length;
            
            int i;
            for(i=N-2;i>=0 && W[i]>=W[i+1];--i){}
            
            if(i<0)
            {
                sb.append("no answer\n");
                continue;
            }
            int minI=i+1;
            for(int j=i+2;j<N;++j)
            {
                if(W[j]>W[i] && W[j]<W[minI])
                    minI=j;
            }
            char t=W[minI];
            W[minI]=W[i];
            W[i]=t;
            
            Arrays.sort(W,i+1,N);
            
            sb.append(W).append("\n");
        }
        System.out.println(sb);
    }
}
