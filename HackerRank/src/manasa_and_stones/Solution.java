package manasa_and_stones;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			displayPossibleStonesValue(n, a, b);
		}
	}

	private static void displayPossibleStonesValue(int n, int a, int b) {

		int ka = n - 1, kb = 0;
		int stonevalue = 0;
		System.out.println();
		while (kb <= n - 1) {
//			System.out.print("0");
			for (int i = 0; i < ka; i++) {
				stonevalue += a;
//				System.out.print(", " + stonevalue);
			}
			for (int i = kb; i > 0; i--) {
				stonevalue += b;
//				System.out.print(", " + stonevalue);
			}
			kb ++;
			ka --;
			System.out.print(stonevalue +" ");
			stonevalue = 0;
		}
	}
}
