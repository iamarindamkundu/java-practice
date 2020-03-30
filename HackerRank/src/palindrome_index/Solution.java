package palindrome_index;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s[] = new String[t];
		
		for (int i = 0; i < t; i++) {
			s[i] = sc.next();
		}
		int arr[] = findIndex(s);
		display(arr);
		sc.close();
	}

	private static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] findIndex(String[] sb) {

		int arr[] = new int[sb.length];
		int index = 0;
		int flag;
		for (int i = 0; i < sb.length; i++) {
			StringBuffer s = new StringBuffer(sb[i]);
			flag = 0;
			for (int j = 0, k = s.length() - 1; j <= s.length() / 2; j++, k-- ) {
//				System.out.println("checking\n");
				if (s.charAt(j) != s.charAt(k)) {
					if (isPalindrome(s.deleteCharAt(j))) {
//						System.out.println("j");
						arr[index++] = j;
						flag = 1;
						break;
					}
					else if (isPalindrome(s.deleteCharAt(k-1))) {
//						System.out.println("k");
						arr[index++] = k;
						flag = 1;
						break;
					}
					arr[index++] = j;
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				arr[index++] = -1;
			}
		}
		return arr;
	}

	private static boolean isPalindrome(StringBuffer s) {

		for (int i = 0, j = s.length() - 1; i <= s.length() / 2; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
