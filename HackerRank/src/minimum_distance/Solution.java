package minimum_distance;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int min = minimumDistance(a);
		System.out.println(min);
		sc.close();
	}

	private static int minimumDistance(int[] a) {

		int dis = a.length;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					if (Math.abs(i - j) < dis) {
						dis = Math.abs(i - j);
					}
				}
			}
		}
		if (dis == a.length)
			return -1;
		else
			return dis;
	}
}
