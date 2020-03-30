package left_rotation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {
    static void rightRotation(int[] arr){
        int temp1=0,temp2=0;
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1){
                arr[0] = arr[i];
            }
            if(i-1==0){
                temp1=arr[i-1];
            }
            temp2=temp1;
            temp1=arr[i];
            arr[i]=temp2;
        }
    }
	static void display(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static void reverseArray(int[] arr){
		int i,j;
		i=0;
		j=arr.length-1;
		for(;i<arr.length/2;i++,j--){
			int swap = arr[j];
			arr[j]=arr[i];
			arr[i]=swap;
		}
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int norot = sc.nextInt();
        int arr[] =  new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
        for(int i=0;i<norot;i++){
            rightRotation(arr);
        }
        reverseArray(arr);
        display(arr);
    }
}