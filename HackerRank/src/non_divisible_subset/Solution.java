package non_divisible_subset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int size = nonDivisibleSubset(a, k);
		System.out.println(size);
		
		sc.close();
	}

	private static int nonDivisibleSubset(int[] a, int k) {

		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {
			if ((a[i] + a[i + 1]) % k != 0){
				System.out.println(a[i]);
				System.out.println(a[i+1]);
				s.add(a[i]);
				s.add(a[i+1]);
			}
			}
		System.out.println(s);
		return s.size();
	}
}
