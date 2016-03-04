import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                arr[i][j]=input.nextInt();
            }
        }
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            for(int j=0;j<arr[0].length-2;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]
                    +arr[i+1][j+1]
                    +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}