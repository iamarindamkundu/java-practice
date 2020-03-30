package sock_merchant;

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
		int count = findPairs(a);
		System.out.println(count);
		sc.close();
	}

	private static int findPairs(int[] a) {

		int len = a.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < len; i++)
			set.add(a[i]);
		int count = 0;
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int element = 0;
			String s = it.next().toString();
			for (int i = 0; i < a.length; i++) {
				if (Integer.valueOf(s) == a[i]){
//					System.out.println(s +" ");
					element ++;	
				}
			}
				count += element / 2;
		}
		return count;
	}
}
