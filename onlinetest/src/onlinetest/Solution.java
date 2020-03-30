package onlinetest;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int result[] = new int[testCase];
		for (int i = 0; i < testCase; i++) {
			int n = sc.nextInt();
			int c = sc.nextInt();
			int plots[] = new int[n];
			for (int j = 0; j < n; j++) {
				plots[j] = sc.nextInt();
			}
			plots = makeProfitArray(plots, c);
			//display(plots);
			result[i] = maxProfitSubArray(plots);
		}
		display(result);
	}
	
	public static void display(int array[]) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	public static int[] makeProfitArray(int[] plots, int c) {
		for (int i = 0; i < plots.length; i++) {
			plots[i] = c - plots[i];
		}
		return plots;
	}
	
	static int maxProfitSubArray(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far < 0 ? 0 : max_so_far;
    }

}
