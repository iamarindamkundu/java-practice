package hackersland_radio_transmitters;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int x[] = createAxis(a);
		display(x);
		int min = minimumTransmitters(x, k);
	}

	private static int minimumTransmitters(int[] x, int k) {

		int count = 0;
		int sat = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 1) {
//				if (i + k < x.length && x[i + k] == 1)
			}
		}
		return 0;
	}

	private static void display(int[] x) {

		System.out.println("Houses are ploted in x axis:");
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + "  ");
	}

	private static int[] createAxis(int[] a) {

		int x[] = new int[2 * a[a.length - 1]];
		for (int i = 0; i < a.length; i++){
			x[a[i]] = 1; 
		}
		return x;
	}
}
