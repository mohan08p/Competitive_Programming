import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        for(int i=1;i<=N;i++) {
            for(int j=N;j>=1;j--) {
                if(j<=i) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}