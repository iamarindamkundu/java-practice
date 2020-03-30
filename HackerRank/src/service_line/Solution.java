package service_line;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int t = sc.nextInt();
		int a[] = new int[len];
		for (int i = 0; i < len; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {
			int entry = sc.nextInt();
			int exit = sc.nextInt();
			int catagory = findVehicleCatagory(a, entry, exit);
			System.out.println(catagory);
		}
		sc.close();
	}

	private static int findVehicleCatagory(int[] a, int entry, int exit) {

		int min = 3;
		for (int i = entry; i <= exit; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
}
