package repeated_string;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		int k = sc.nextInt();
		int a[] = positionOfA(str);
//		display(a);
		int n = countA(a, k);
		System.out.println(n);
		
		sc.close();
	}

	private static int countA(int[] a, int k) {

		int len = a.length;
		int count = 0;
		if (len > k) {
			count = countAInString(a, len % k);
		}
		else {
//			System.out.println("here");
			int r = k / len;
			int remain = k % len;
			int temp = countAInString(a, a.length);
			count = r * temp + countAInString(a, remain);
			
		}
		return count;
	}

	private static int countAInString(int[] a, int len) {

		int count = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1)
				count ++;
		}
//		System.out.println(count);
		return count;
	}

	private static void display(int[] a) {

		System.out.println("display string:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static int[] positionOfA(String str) {

		int a[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				a[i] = 1;
			}
			else {
				a[i] = 0;
			}
		}
		return a;
	}
}
