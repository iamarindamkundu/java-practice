package running_time_of_algorithms;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = insertionSort(a);
        System.out.println(count);
	}
	
	private static int insertionSort(int a[]) {
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    count ++;
                    System.out.println(i +":"+ j);
                    display(a);
                }
            }
        }
        return count;
    }

	private static void display(int[] a) {

		System.out.println("Array:");
		for (int n : a) {
			System.out.print(n + "  ");
		}
		System.out.println();
	}
}
