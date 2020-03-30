package modified_kaprekar_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	static void display(int[] ai) {
		System.out.println("array:");
		for (int i : ai) {
			System.out.print(i + " ");
		}
	}
	static int[] findArray(int kSq) {
		int[] ai = Integer.toString(kSq).chars().map(c -> c-= '0').toArray();
//		display(ai);
//		System.out.println("arraylength"+ ai.length);
		return ai;
	}

	static int checkKaprekar(int k) {
	
		int kSq = (int) Math.pow(k, 2);
		System.out.println("sq:"+kSq);
		int karr[] = findArray(kSq);
		if (karr.length == 1) {
			if (k == kSq) 
				return k;
		}
		else if (karr.length % 2 == 0) {
			int r = karr.length / 2;
			int l = karr.length / 2;
			int rNum = findRightNum(karr, r);
			int lNum = findLeftNum(karr, l);
			if (rNum + lNum == k)
				return k;
		}
		else if (karr.length % 2 != 0) {
			int l = karr.length / 2;
			int r = karr.length - l;
			int lNum = findLeftNum(karr, l);
			int rNum = findRightNum(karr, r-1);
			if (rNum + lNum == k) {
				return k;
			}
//			l = karr.length / 2 + 1;
//			r = karr.length - l + 1;
//			lNum = findLeftNum(karr, l);
//			rNum = findRightNum(karr, r);
//			if (lNum + rNum == k) {
//				return k;
//			}
		}
		return 0;
	}
	
	private static int findLeftNum(int[] karr, int l) {
		int i = 0;
		int lNum = 0;
		while (i <= l-1) {
			lNum = lNum*10 + karr[i++];
		}
//		System.out.println("LeftSide:" + lNum);
		return lNum;
	}
	private static int findRightNum(int[] karr, int r) {
		int i = r;
		int rNum = 0;
		while (i < karr.length) {
			rNum = rNum*10 + karr[i++];
		}
//		System.out.println("RightSide:" + rNum);
		return rNum;
	}
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int flag = 0;
		for(int i=p;i<=q;i++){
//			System.out.println();
			int value;
			if ( (value = checkKaprekar(i)) != 0) {
				System.out.print(value + " ");
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("INVALID RANGE");
		}
	}
}
