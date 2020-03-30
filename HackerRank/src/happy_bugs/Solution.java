package happy_bugs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		for (int i = 0; i < g; i++) {
			int n = sc.nextInt();
			String b = sc.next();
			String str = arrangeString(b);
		}
	}

	private static String arrangeString(String b) {

		String str = "";
		for (int i = 0; i < b.length();) {
			str += b.charAt(i) + "";
			int count = 0;
			for (int j = i + 1; j < b.length(); j++) {
				if (b.charAt(i) == b.charAt(j)) {
					str += b.charAt(j) + "";
					count ++;
					System.out.println(count);
				}
			}
			i = count != 0 ? count + 1 : i + 1;
		}
		System.out.println("string:" + str);
		return null;
	}
}
