package love_letter_mystery;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		String s[] = new String[testCase];
		for (int i = 0; i < testCase; i++) {
			s[i] = sc.next();
			
		}
		int arr[] = findNumChange(s);
		display(arr);
		
		sc.close();
	}

	private static void display(int[] arr) {

//		System.out.println("operation list:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static int[] findNumChange(String[] str) {

		int arr[] = new int[str.length];
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			char[] s = new char[str[i].length()];
			s = str[i].toCharArray();
			int count = 0;
			while (!isPalindrome(s)) {
				for (int j = 0, k = s.length - 1; j <=s.length/2; j++, k--) {
					if (s[j] != s[k]) {
						int ch1 = s[j];
						int ch2 = s[k];
						if (ch1 > ch2) {
							s[k] += ch1 - ch2;
							count += ch1 - ch2;
						}
						else {
							s[j] += ch2 - ch1;
							count += ch2 - ch1;
						}
					}
				}
			}
			arr[index++] = count;
		}
		return arr;
	}

	private static boolean isPalindrome(char[] str) {

		for (int i = 0, j = str.length - 1; i <= str.length/2; i++, j--) {
			if (str[i] != str[j]) 
				return false;
		}
		return true;
	}
	
}
