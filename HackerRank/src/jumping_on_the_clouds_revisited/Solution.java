package jumping_on_the_clouds_revisited;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int energy = remainingEnergy(a, k);
		System.out.println(energy);
		sc.close();
	}

	private static int remainingEnergy(int[] a, int k) {

		int index = 0;
		int energy = 100;
		do {
			index = (index + k) % a.length;
			if (a[index] == 0)
				energy --;
			else
				energy -= 3;
		}while(index != 0);
		return energy;
	}
}
