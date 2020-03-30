package counting_sort1;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int count = 0;
        for (int i = 0; i < 99; i++) {
            count = 0;
            for (int j : a) {
                if (i == j)
                    count ++;
            }
            System.out.print(count + " ");
        }
        sc.close();
    }
}
