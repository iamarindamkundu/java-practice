package quicksort_inplace;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		sort(a, 0, a.length - 1);
	}

	private static void sort(int[] a, int low, int high) {

		if (low < high) {
			int pi = partition(a, low, high);
			
			display(a);
			sort(a, low, pi - 1);
			sort(a, pi + 1, high);
		}
	}

	private static void display(int[] a) {

//		System.out.println("Your array:");
		for (int item : a) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	private static int partition(int[] a, int low, int high) {

		int pivot = a[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i ++;
//				swap a[i] and a[j]
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
//		swap a[i+1] and a[high] or pivot
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;
		return i+1;
	}
}
