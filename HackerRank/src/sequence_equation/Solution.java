package sequence_equation;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[a[j] - 1] == i) {
					System.out.println(j + 1);
				}
			}
		}
		
		sc.close();
	}
}
