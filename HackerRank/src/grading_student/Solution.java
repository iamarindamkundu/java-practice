package grading_student;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		gradingStudent(arr);
		sc.close();
	}

	private static void gradingStudent(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num > 40) {
				int flag = 0;
				for (int j = 8; j <= 20; j++) {
					if ((5 * j) - num > 0 && (5 * j) - num < 3) {
						System.out.println(5 * j);
						flag = 1;
						break;
					}
				}
				if (flag == 0)
					System.out.println(num);
			}
			else {
				if (num >= 38)
					System.out.println(40);
				else 
					System.out.println(num);
			}
		}
	}
}
