import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int findMinElement(int[] arr){
        int min = 10000;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min && arr[i]!=0)
                min = arr[i];
        }
        return min;
    }
    static boolean arrayElementZero(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int count = 0;
        while(!arrayElementZero(arr)){
            int min = findMinElement(arr);
            System.out.println("Min:"+min);
            count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    arr[i]-=min;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

