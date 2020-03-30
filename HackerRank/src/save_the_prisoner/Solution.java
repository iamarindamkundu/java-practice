package save_the_prisoner;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s = sc.nextInt();
			int temp = m % n;
			int d = temp - 1;
			s += d;
			System.out.println(s % n);
		}
	}
}
