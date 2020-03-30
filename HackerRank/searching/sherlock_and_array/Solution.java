package sherlock_and_array;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			String s = equalLeftRight(a);
			System.out.println(s);
		}
	}

	private static String equalLeftRight(int[] a) {

		if (a.length < 2) 
			return "YES";
		else{
			for (int i = 1; i < a.length - 1; i++) {
				int leftsum = 0,  rightsum = 0;
				for (int j = 0; j < i; j++) {
					leftsum += a[j];
				}
				for (int j = i +1; j < a.length; j++) {
					rightsum += a[j];
				}
				if (leftsum == rightsum)
					return "YES";
			}
		}
		return "NO";
	}
}
