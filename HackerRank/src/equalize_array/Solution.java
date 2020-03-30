package equalize_array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int element = occurMost(a);
		System.out.println(element);
		sc.close();
	}

	private static int occurMost(int[] a) {

		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		int count = 0;
		int element = 0;
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int ele = it.next();
			int c = 0;
			for (int i = 0; i < a.length; i++) {
				if (ele == a[i]){
					c++;
				}
			}
			if (c > count) {
				element = ele;
				count = c;
			}
		}
//		System.out.println("Element has max occurance:" + element);
//		System.out.println("Number of occurance:" + count);
		if (count >= a.length / 2) {
			return a.length - count;
		}
		else {
			return a.length - count;
		}
	}
}
