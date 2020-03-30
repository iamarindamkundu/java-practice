package ACM_ICPC_team;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		maxTeam(s);
		sc.close();
	}

	private static void maxTeam(String[] s) {

		int arr[] = new int[s[0].length()];
		int count = 0, c = 0, maxtopic = 0;
		for (int i = 0; i < s.length - 1; i++) {
			String str1 = s[i];
			for (int j = i + 1; j < s.length; j++) {
				String str2 = s[j];
				c = 0;
				for (int k = 0; k < s[0].length(); k++) {
					arr[k] = Integer.valueOf(str1.charAt(k) + "") | Integer.valueOf(str2.charAt(k) + "");
				}
				c = findNoOfOne(arr);
//				System.out.println(c);
				if (c > maxtopic) {
					
					count = 0;
					maxtopic = c;
					count ++;
//					System.out.println("Maxtopic:" + maxtopic);
				}
				else if (c == maxtopic) {
					count ++;
				}
			}
//			System.out.println("--");
		}
//		System.out.println("-------");
		System.out.println(maxtopic);
		System.out.println(count);
	}

	private static int findNoOfOne(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length ; i++) {
			if (arr[i] == 1) {
				count ++;
			}
		}
		return count;
	}
}
