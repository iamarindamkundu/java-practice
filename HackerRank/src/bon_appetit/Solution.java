package bon_appetit;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		int b = sc.nextInt();
		int bactual = findAnnasBill(a, k);
		if (bactual == b) 
			System.out.println("Bon Appetit");
		else
			System.out.println(b - bactual);
		sc.close();
	}

	private static int findAnnasBill(int[] a, int k) {

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != k)
				sum += a[i];
		}
		int annasbill = sum / 2;
//		System.out.println(annasbill);
		return annasbill;
	}
}
