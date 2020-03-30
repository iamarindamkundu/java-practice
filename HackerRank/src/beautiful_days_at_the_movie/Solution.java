package beautiful_days_at_the_movie;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int ed = sc.nextInt();
		int k = sc.nextInt();
		int count = countBeautifulDays(st, ed, k);
		System.out.println(count);
		sc.close();
	}

	private static int countBeautifulDays(int st, int ed, int k) {

		int count = 0;
		for (int i = st; i <= ed; i++) {
			StringBuffer sb = new StringBuffer(String.valueOf(i));
			StringBuffer sbreverse = new StringBuffer(String.valueOf(i));
//			System.out.println("temp:" + temp);
			sb.reverse();
//			System.out.println("reverse:" + sb);
			int x = Integer.valueOf(sbreverse.toString());
//			System.out.println(x);
			int y = Integer.valueOf(sb.toString());
//			System.out.println(y);
			if (Math.abs(x - y) % k == 0) {
				count ++;
			}
		}
		return count;
	}
}
