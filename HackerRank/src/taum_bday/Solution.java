package taum_bday;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int b = sc.nextInt();
			int w = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int totalcost = 0;
			if (z < x || z < y) {
				if (x < y && (x+z) < y) {
					totalcost = x*b + (x+z)*w;
				}
				else if (y < x && (y+z) < x) {
					totalcost = y*w + (y+z)*b;
 				}
				else {
					totalcost = x*b + y*w;
				}
			}
			else {
				totalcost = x*b + y*w;
			}
			System.out.println(totalcost);
		}
		sc.close();
	}
}
