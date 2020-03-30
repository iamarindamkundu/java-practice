package left_rotation;

import java.util.Scanner;
public class Solution {

	static void reverseArray(int[] arr){
		int i,j;
		for (i = 0, j = arr.length-1; i <= arr.length/2; i++, j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	static void displayArray(int[] arr){
		System.out.println("\nArray elements:");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
	}
	static int[] rightRotation(int arr[], int noRotation){
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++){
			if (i + noRotation >= arr.length) {
				newArr[(i + noRotation)%arr.length] = arr[i];
			}
			else{
				newArr[i + noRotation] = arr[i];
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int noRotation = sc.nextInt();
		int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		reverseArray(array);
		displayArray(array);
		int newArr[] = rightRotation(array, noRotation);
		displayArray(newArr);
		reverseArray(newArr);
		displayArray(newArr);
	}
}
/*
 * test cases:
 * 1.  	14 7
 * 		98 67 35 1 74 79 7 26 54 63 24 17 32 81
 * expected output: 
 * 2.	20 10
 * 		41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51
 * expected output: 77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77	
 * */
 