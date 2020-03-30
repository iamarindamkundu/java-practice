package leonardo_s_prime_factor;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int count = 0;
			int num = sc.nextInt();
			for (int j = 1; j <= num; j++) {
				if (num % j == 0) {
					if (isPrime(j)){
						System.out.println(j);
						count ++;
					}
				}
			}
			System.out.println(count);
		}
	}

	private static boolean isPrime(int j) {

		if (j < 2)
			return false;
		else if (j == 2)
			return true;
		else if (j > 2) {
			for (int i = 2; i <= Math.sqrt(j); i++) {
				if (j % i == 0)
					return false;
			}
		}
		return true;
	}
}
