package maximum_subarray_sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}
			int max = maxSubarraySumMode(a, m);
			System.out.println(max);
		}
		sc.close();
	}

	private static int maxSubarraySumMode(int[] a, int m) {

//		find all subsets of array a
		int len = a.length;
		int max = 0;
		for (int i = 0; i < (1 << len); i++) {
			int sum = 0;
			for (int j = 0; j < len; j++) {
				if ((i & (1 << j)) > 0) 
					sum += a[j] ;
			}
			max = sum % m > max ? sum % m : max;
		}
		return max;
	}
}
