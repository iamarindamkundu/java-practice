package sherlock_and_squares;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int count = findSquares(sc.nextInt(), sc.nextInt());
			System.out.println(count);
		}
		sc.close();
	}

	private static int findSquares(int a, int b) {

		int sq = 1, count = 0;
		while (sq * sq <= b) {
			if (sq*sq >= a) {
				count ++;
			}
			sq++;
		}
		return count;
	}
}
