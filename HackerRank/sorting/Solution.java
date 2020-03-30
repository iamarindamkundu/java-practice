import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int median;
		if (a.length % 2 != 0) {
			median = partitionForOdd(a);
//			System.out.println("<" + median + ">");
			System.out.println(median);
		}
		else {
//			median = partitionForEven(a);
			float median1 = partitionForEven(a);
//			System.out.println("<"+ median1 + ">");
			System.out.println(median1);
		}
		sc.close();
	}

	private static float partitionForEven(int[] a) {

		int equal = 0;
		List<Integer> left;
		List<Integer> right;
		do {
			equal = a[a.length / 2];
			left = new ArrayList<Integer>();
			right = new ArrayList<Integer>();
			for (int i = 0; i < a.length; i++) {
				if (a[i] < equal) {
					left.add(a[i]);
//					System.out.println("left:" + a[i]);
				}
				else if (a[i] > equal) {
					right.add(a[i]);
//					System.out.println("right:" + a[i]);
				}
			}
			a = recreateArrayFromList(left, right, equal, a.length);
		}while(left.size() -1 != right.size());
		return (float)(left.get(left.size() - 1) + equal) / 2;
	}

	private static int partitionForOdd(int[] a) {

		int equal = 0;
		List<Integer> left;
		List<Integer> right;
		do {
			equal = a[a.length / 2];
			left = new ArrayList<Integer>();
			right = new ArrayList<Integer>();
			for (int i = 0; i < a.length; i++) {
				if (a[i] < equal) {
					left.add(a[i]);
//					System.out.println("left:" + a[i]);
				}
				else if (a[i] > equal) {
					right.add(a[i]);
//					System.out.println("right:" + a[i]);
				}
			}
			a = recreateArrayFromList(left, right, equal, a.length);
		}while(left.size() != right.size());
		return equal;
	}

	private static int[] recreateArrayFromList(List<Integer> left, List<Integer> right, int equal, int length) {

		int a[] = new int[length];
		int i = 0;
		for (int item : left)
			a[i++] = item;
		a[i++] = equal;
		for (int item : right)
			a[i++] = item;
//		display(a);
		return a;
	}

	private static void display(int[] a) {

		System.out.println("Your array:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
