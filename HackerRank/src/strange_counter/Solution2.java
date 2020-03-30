package strange_counter;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int value = findValueAtTime(time);
		System.out.println(value);
	}

	private static int findValueAtTime(int time) {

		int v = 3;
		int init = 3;
		for (int i = 1; i <= time; i++) {
			if (v == 0) {
				v = 2 * init;
				init = v;
//				System.out.println("******time:" + i + " value:" + v);
				v --;
			}
			else {
//				System.out.println("time:" + i + " value:" + v);
				v --;
			}
		}
		return v + 1;
	}
}
