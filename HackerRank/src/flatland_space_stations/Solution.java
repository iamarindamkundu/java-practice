package flatland_space_stations;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[] = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		int max = maxDistance(a, n);
		System.out.println(max);
		sc.close();
	}

	private static int maxDistance(int[] a, int n) {

		int max = 0;
		for (int i = 0; i < n; i++) {
			int dis = findNearestSpaceStation(i, a);
//			System.out.println("i:" + i + ":" + dis);
			if (max < dis) {
				max = dis;
			}
		}
		return max;
	}

	private static int findNearestSpaceStation(int stat, int[] a) {

		int dis = 2147483647;
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - stat) < dis) {
				dis = Math.abs(a[i] - stat);
			}
		}
		return dis;
	}
}
