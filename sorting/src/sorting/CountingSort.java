package sorting;

import java.util.Scanner;

public class CountingSort {
/*
 * Counting sort has a time complexity of O(n).
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of your array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter your array elements:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int max = findMaxElement(a);
		int count[] = new int[max + 1];
		count = findElementFrequency(a, count);
		System.out.println("Display frequency of elements:");
		display(count);
//		modify the count array by adding previous count
		count = addPreviousCount(count);
		System.out.println("Count array after modification:");
		display(count);
		int places[] = new int[n + 1];
//		place the objects in there correct position and decrease the count by one
		for (int i = 0; i < n; i++) {
			places[count[a[i]]] = a[i];
			count[a[i]] --;
		}
		System.out.println("Display sorted array:");
		for (int i = 1; i < places.length; i++)
			System.out.print(places[i] + " ");
		System.out.println();
		sc.close();
	}

	private static int[] addPreviousCount(int[] count) {

		int sum = 0;
		for (int i= 0; i < count.length; i++) {
			sum += count[i];
			count[i] = sum;
		}
		return count;
	}

	private static void display(int[] count) {

		for (int i = 0; i < count.length; i++)
			System.out.print(count[i] + " ");
		System.out.println();
	}

	private static int[] findElementFrequency(int[] a, int[] count) {

		
		for (int i = 0; i < a.length; i++) {
			count[a[i]] ++;
		}
		return count;
	}

	private static int findMaxElement(int[] a) {

		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}
}
