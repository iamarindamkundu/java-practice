package insertion_sorting_part1;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[size - 1];
		for (int i = size - 2; i >= 0; i --) {
			if (arr[i] < temp) {
				arr[i + 1] = temp;
				break;
			}
			else {
				arr[i + 1] = arr[i];
			}
//			if (arr[i - 1] < temp) {
//				arr[i] = temp;
//				break;
//			}
			displaySortedArray(arr);
		}
		if (temp < arr[0]) {
			arr[0] = temp;
		}
		displaySortedArray(arr);
		sc.close();
	}

	private static void displaySortedArray(int[] arr) {

//		System.out.println("Sorted Array:");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "");
		System.out.println();
	}
}
