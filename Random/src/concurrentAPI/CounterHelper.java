package concurrentAPI;

import java.util.Scanner;

public class CounterHelper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("#########################");
		for (int i = 1; i <= 30_000; i++)
		{
			System.out.print(sc.next());
			System.out.print(" ");
		}
		System.out.println("#########################");
	}
}
