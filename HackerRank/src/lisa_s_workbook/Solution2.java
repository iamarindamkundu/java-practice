package lisa_s_workbook;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int pages = Solution.lisasBookPages(a, k);
//		System.out.println("pages in lisa's book:" + pages);
		int s[][] = new int[pages][];
		int count = specialProblem(s, a, k);
		System.out.println(count);
		sc.close();
	}

	private static int specialProblem(int[][] s, int[] a, int k) {

//		System.out.println(s.length);
		int l = -1;
		for (int i = 0; i < a.length; i++) {
			l++;
			int temp = a[i];
			s[l] = new int[temp / k == 0 ? temp % k : k];
			temp = temp / k == 0 ? temp % k : temp - k;
			int m = 0;
			for (int j = 1; j <= a[i] ; j++) {
				if (s[l].length == k && s[l][k - 1] != 0) {
					l++;
					s[l] = new int[temp / k == 0 ? temp % k : k];
					temp = temp / k == 0 ? temp % k : temp - k;
					m = 0;
//					System.out.println("filling up...");
				}
				s[l][m++] = j;
//				System.out.println("filling up...0");
			}
		}
//		display(s);
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				if (i + 1 == s[i][j]){
					count ++;
				}
			}
		}
		return count;
	}

	private static void display(int[][] s) {

		System.out.println("lisa's workbook:");
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}
	}
}
