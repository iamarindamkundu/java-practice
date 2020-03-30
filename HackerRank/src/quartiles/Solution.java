package quartiles;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sortArray(arr);
        double q1,q2,q3;
        if (arr.length % 2 == 0) {
        	q2 = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
        	int aq1[] = new int[arr.length / 2 - 2];
        	for (int i = 0; i < arr.length / 2 - 1; i++) {
        		aq1[i] = arr[i];
        	}
        	q1 = aq1[aq1.length / 2];
        	int aq2[] = new int[arr.length - (arr.length / 2 + 1)];
        	for (int i = 0, j = arr.length / 2 + 1; i < aq2.length; i++, j++) {
        		aq2[i] = arr[j];
        	}
        	q3 = aq2[aq2.length / 2];
        }
        else {
        	q2 = arr[arr.length / 2];
        	int aq1[] = new int[arr.length / 2];
        	for (int i = 0; i < aq1.length; i++) {
        		aq1[i] = arr[i];
        	}
        	q1 = (aq1[aq1.length / 2 - 1] + aq1[aq1.length / 2]) / 2;
        	int aq2[] = new int[arr.length - (arr.length / 2 + 1)];
        	for (int i = 0, j = arr.length / 2 + 1; i < aq2.length; i++, j++) {
        		aq2[i] = arr[j];
        	}
        	q3 = (aq2[aq2.length / 2 - 1] + aq2[aq2.length / 2]) / 2;
        }
        System.out.println(q1 + "\n" + q2 + "\n" + q3);
        sc.close();
    }

	private static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int swap = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = swap;
				}
			}
		}
		return arr;
	}

}
