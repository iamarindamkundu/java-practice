package library_fine;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int da = sc.nextInt();
		int ma = sc.nextInt();
		int ya = sc.nextInt();
		int de = sc.nextInt();
		int me = sc.nextInt();
		int ye = sc.nextInt();
		
		if (ya > ye)
			System.out.println(10000);
		else if (ma > me && ya == ye) {
			System.out.println(500 * (ma - me));
		}
		else if (da > de && ma == me && ya == ye) {
			System.out.println(15 * (da - de));
		}
		else {
			System.out.println(0);
		}
		sc.close();
	}
}
