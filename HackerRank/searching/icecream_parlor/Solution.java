package icecream_parlor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < a.length; j++) 
				a[j] = sc.nextInt();
			displayFlavours(a, m);
		}
	}

	private static void displayFlavours(int[] a, int m) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == m) {
					System.out.println( (i+1) + " " + (j + 1));
					break;
				}
			}
		}
	}
}
