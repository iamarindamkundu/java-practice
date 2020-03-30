import java.util.*;

public class PermuteAllListNumbers {

	static void permute (int a[], int k) {
		if (k == a.length) {
			for (int i = 0; i < a.length; i++ ) {
				System.out.print("["+a[i]+"]");
			}
			System.out.println();
		}
		else {
			for (int i = k; i < a.length; i++) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
				System.out.println("Temp1");

				permute(a, k + 1);
				System.out.println("Temp2");
				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
	
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the list:");
		int len = sc.nextInt();
		int a[] = new int[len];
		for (int i = 0; i < len; i++) {
			a[i] = Math.abs(random.nextInt(100));
		}
		System.out.println("The original array:");
		for (int i = 0; i < len; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("\nThe permuted array:");

		permute(a, 0);
		sc.close();
	}
}