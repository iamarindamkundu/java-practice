package divisible_sum_pairs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count = findSumPairs(arr, k);
		System.out.println(count);
		sc.close();
	}

	private static int findSumPairs(int[] arr, int k) {

		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) % k  == 0) {
//					System.out.println("a[" + i + "] + " + "a[" + j + "]:");
					count ++;
				}
			}
		}
		return count;
	}
}
