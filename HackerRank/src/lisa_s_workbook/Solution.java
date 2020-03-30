// not working accurately: check for solution2

package lisa_s_workbook;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int pages = lisasBookPages(a, k);
		System.out.println("pages in lisa's book:" + pages);
		String[] s = new String[pages];
		int count = specialProblem(s, a, k);
		System.out.println(count);
		sc.close();
	}

	private static int specialProblem(String[] s, int[] a, int k) {

		int l = -1;
		for (int i = 0; i < a.length; i++) {
//			int result = a[i] / k;
			l++;
			s[l] = "";
			for (int j = 1; j<= a[i]; j++) {
				if (s[l].length() == k){
					l++;
					s[l] = "";
				}
				s[l] += j + "";
			}
//			l++;
//			s[l] = "";
		}
		display(s);
//		count special problems
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (Integer.valueOf(s[i].charAt(j) + "") == i + 1) {
					System.out.println("i:" + i + "j:" + j);
					count ++;
				}
			}
			System.out.println(i);
		}
		return count;
	}

	private static void display(String[] s) {

		System.out.println("lisa's book:" + s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public static int lisasBookPages(int[] a, int k) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k != 0) {
				count += a[i] / k;
				count ++;
			}
			else {
				count += a[i] / k;
			}
		}
		return count;
	}
}
