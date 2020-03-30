package project_euler_211;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lineOfInput = sc.nextInt();
		ArrayList<ArrayList<Integer>> nAndKs = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < lineOfInput; i++) {
			ArrayList<Integer> nAndK = new ArrayList<Integer>();
			nAndK.add(sc.nextInt());
			nAndK.add(sc.nextInt());
			nAndKs.add(nAndK);
		}
		
		for (ArrayList<Integer> nAndK : nAndKs) {
			findSumOfSquareOfDivisor(nAndK.get(0));
		}
		
		
		System.out.println(nAndKs);
	}
	
	public int findSumOfSquareOfDivisor(int n) {
		int finalsum = 0;
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {
				int num = 1;
				if (i%j==0) {
					num = j*j;
					sum+=num;
				}
			}
			
		}
	}

}
