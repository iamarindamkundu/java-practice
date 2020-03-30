package the_hurdle_race;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int noofbeverage = beverageCount(a, h);
		System.out.println(noofbeverage);
		sc.close();
	}

	private static int beverageCount(int[] a, int h) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > h) {
				int temp = a[i] - h;
				h += temp;
				count += temp;
			}
		}
		return count;
	}
}
