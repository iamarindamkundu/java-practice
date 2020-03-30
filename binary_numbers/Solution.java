package binary_numbers;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String convertBinary(int n){
        String s="";
        while(n!=0){
            s = s + String.valueOf(n%2);
            n/=2;
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    static int calculateMaxConsecutiveOne(String binary){
        char arr[] = binary.toCharArray();
        int max = 0,count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                count+=1;
            }
            else{
                if(count>max){
                    System.out.println("count:"+count);
                    max = count;
                }
                count=0;
            }
        }
        if(count>max){
            max = count;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = convertBinary(n);
        System.out.println("binary:"+binary);
        System.out.println(calculateMaxConsecutiveOne(binary));
    }
}