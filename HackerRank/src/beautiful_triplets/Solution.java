package beautiful_triplets;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int triplets = countBeautifulTriplets(a, d);
		System.out.println(triplets);
		sc.close();
	}

	private static int countBeautifulTriplets(int[] a, int d) {

		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] - a[i] == d) {
					for (int k = j + 1; k < a.length; k++) {
						if (a[k] - a[j] == d) {
							count ++;
							break;
						}
					}
				}
			}
		}
		return count;
	}
}
