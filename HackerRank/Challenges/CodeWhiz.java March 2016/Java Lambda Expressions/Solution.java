import java.io.*;
import java.util.*;
interface performOperation{
    int check(int a);
}
class Math{
   public static int checker(performOperation p ,int num){
       return p.check(num);
   }
     
   // Write your code here
    public performOperation checkEvenOdd(){
    return (a)-> {if (a%2==0)return 0;return 1;};
    }
    public performOperation checkPrime(){
        return (a)-> {for(int i=2;i<=a/2;i++){
            if(a%i==0)
                return 1;
        }return 0;};
    }
    public performOperation checkPalindrome(){
        return (a)-> {int rev=0;int r=0;int n=a;
                  while(n!=0){
                      r=n%10;
                      rev=rev*10+r;
                      n/=10;
                  }
                  if(rev==a)
                      return 0;
                  return 1;

                 };
        }
    }    
          
public class Solution {

    public static void main(String[] args)throws IOException {
        Math ob = new Math();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        performOperation op;
        int ret =0;
        String ans=null;
        while(T-->0){
            String s=br.readLine().trim();
            StringTokenizer st=new StringTokenizer(s);
            int ch=Integer.parseInt(st.nextToken());
            int num=Integer.parseInt(st.nextToken());
            if(ch==1){
                op = ob.checkEvenOdd();  
                ret = ob.checker(op,num);
                ans = (ret == 0)?"EVEN":"ODD";
            }
            else if(ch==2){
                op = ob.checkPrime();
                ret = ob.checker(op,num);
                ans = (ret == 0)?"PRIME":"COMPOSITE";
            }
            else if(ch==3){
                op = ob.checkPalindrome();
                ret = ob.checker(op,num);
              	ans = (ret == 0)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
          
}