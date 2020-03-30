package cavity_map;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int arr[][] = new int[n][n];
		String s[] = new String[n];
		for (int i = 0; i < n; i++)
//			for (int j = 0; j < n; j++)
//				arr[i][j] = sc.nextInt();
				s[i] = sc.next();
		
//		arr = cavityMaping(arr);
		s = cavityMapingString(s);
//		display(arr);
		displayCavity(s);
	}

	private static void displayCavity(String[] s) {

		for (int i = 0; i < s.length; i++)
			System.out.println(s[i]);
	}

	private static String[] cavityMapingString(String[] s) {

		for (int i = 1; i < s.length - 1; i++)
			for (int j = 1; j < s.length - 1; j++) {
				int up = Character.isAlphabetic(s[i - 1].charAt(j)) ? 10 : Integer.valueOf(s[i - 1].charAt(j) + "");
				int down = Character.isAlphabetic(s[i + 1].charAt(j)) ? 10 : Integer.valueOf(s[i + 1].charAt(j) + "");
				int left = Character.isAlphabetic(s[i].charAt(j - 1)) ? 10 : Integer.valueOf(s[i].charAt(j - 1) + "");
				int right = Character.isAlphabetic(s[i].charAt(j + 1)) ? 10 : Integer.valueOf(s[i].charAt(j + 1) + "");
				int value = Character.isAlphabetic(s[i].charAt(j)) ? 10 : Integer.valueOf(s[i].charAt(j) + "");
				if (value > up && value > down && value > left && value > right && (up != 10 && down != 10 && left != 10 && right != 10)){
					System.out.println("i:" + i + "j:" + j);
					s[i] = s[i].replace(s[i].charAt(j), 'X');
				}
			}
		return s;
	}

	private static void display(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 88)
					System.out.print("X");
				else
					System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] cavityMaping(int[][] arr) {

		for (int i = 1; i < arr.length - 1; i++)
			for (int j = 1; j < arr[0].length - 1; j++){
				if (arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i][j + 1]) {
					arr[i][j] = 88;
				}
			}
		return arr;
	}
}
