package jumping_on_the_clouds;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int jumps = countMinJumps(a);
		System.out.println(jumps);
		sc.close();
	}

	private static int countMinJumps(int[] a) {

		int count = 0;
		for (int i = 0; i < a.length; ) {
//			System.out.println("value of i:" + i);
			if (i + 2 < a.length && a[i + 2] == 0){
//				System.out.println("double jumps");
				i += 2;
				count ++;
			}
			else if (i + 1 < a.length && a[i + 1] == 0){
//				System.out.println("single jumps");
				i += 1;
				count ++;
			}
			else 
				i++;
		}
//		System.out.println("count:" + count);
		return count;
	}
}
