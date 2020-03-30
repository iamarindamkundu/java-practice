package Find_the_minimum_number;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cp = n;
		System.out.print("min(int, ");
		n --;
		while(n > 0) {
			if ( n == 1) {
				System.out.print("int");
				n --;
			}
			else {
				System.out.print("min(int, ");
				n --;
			}
		}
		for (int i = 1; i < cp; i++)
			System.out.print(")");
	}
}
