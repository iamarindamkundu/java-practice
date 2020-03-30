package viral_advertising;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int people = 5, show = 0;
		do{
			int temp = (int) Math.floor(people / 2);
			show += temp;
			people = temp * 3;
			n --;
		}while( n > 0);
		System.out.println(show);
		sc.close();
	}
}
