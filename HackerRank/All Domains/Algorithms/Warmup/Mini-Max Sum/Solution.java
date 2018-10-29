import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        long[] res = new long[5];
        long sum = 0;
        for(int i=0;i<5;i++){
            sum += arr[i];
        }
        long min = 0;
        long max = 0;
        for(int i=0;i<5;i++){
            if(i == 0){
                min = arr[i];
                max = arr[i];
            }
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.print(sum-max+" ");
        System.out.println(sum-min);
    }
}
