package anagram;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] s = new String[t];
		for (int i = 0; i < t; i++) {
			s[i] = sc.next();
		}
		int arr[] = findAnagrmaOperation(s);
	}

	private static int[] findAnagrmaOperation(String[] s) {

		int arr[] = new int[s.length];
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			String str = s[i];
			int flag = 0, count = 0;
			if (str.length() % 2 != 0) {
				arr[i] = -1;
			}
			else {
				for (int j = 0; j < str.length() / 2; j++) {
					char ch = str.charAt(j);
//					character occur how many times in first-half
					if (!OccurPreviously(0, j - 1, ch, str)){
						int chfh = findOccuranceFh(ch, str);
						System.out.println(ch + " has " + chfh + " occurance in first half.");
					}
					
					if (!OccurPreviously(str.length() / 2, str.length() / 2 + j - 1, ch, str)) {
						int chlh = findOccuranceLh(ch, str); 
						System.out.println(ch + " has " + chlh + " occurance in second half.");
					}
				}
				System.out.println("--------------------------------");
			}
		}
		return null;
	}

	private static int findOccuranceLh(char ch, String str) {

		int count = 0;
		for (int i = str.length() / 2; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count ++;
			}
		}
		return count;
	}

	private static int findOccuranceFh(char ch, String str) {

		int count = 0;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == ch) {
				count ++;
			}
		}
		return count;
	}

	private static boolean OccurPreviously(int st, int ed, char ch, String str) {

		for (int i = st; i <= ed; i++) {
			if (ch == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
