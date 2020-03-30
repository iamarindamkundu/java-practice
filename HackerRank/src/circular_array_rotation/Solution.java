package circular_array_rotation;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		a = rightRotation(a, k);
		for (int i = 0; i < q; i++) {
			System.out.println(a[sc.nextInt()]);
		}
//		display(a);
		sc.close();
	}

	private static void display(int[] a) {

		System.out.println("Your array:");
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	private static int[] rightRotation(int[] a, int k) {

		int t[] = new int[k % a.length];
		int index = a.length - (k % a.length);
		for (int i = index, j = 0; i < a.length; i++, j++) {
			t[j] = a[i];
		}
		for (int i = k % a.length, j = 0; i < a.length; i++, j++) {
			a[i] = a[j];
		}
//		System.out.println("length of t:" + t.length);
		for (int i = 0; i < t.length; i++)
			a[i] = t[i];
		return a;
	}
}
