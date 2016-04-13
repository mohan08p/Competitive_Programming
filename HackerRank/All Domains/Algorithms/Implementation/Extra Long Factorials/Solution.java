import java.math.BigInteger;
import java.util.Scanner;

class Solution {
     public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          byte N=input.nextByte();
          String fact=factorial(N);
          System.out.println(fact);
     }
     public static String factorial(byte N) {
          BigInteger fact=new BigInteger("1");
          for(int i=1;i<=N;i++) {
               fact=fact.multiply(new BigInteger(i+""));
          }
          return fact.toString();
     }
}