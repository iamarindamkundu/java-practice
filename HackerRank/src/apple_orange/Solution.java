package apple_orange;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
        	int d = apple[i] + a;
        	if (d <= t && d >= s) {
        		count ++;
        	}
        }
        System.out.println(count);
        count = 0;
        for (int i = 0; i < n; i++) {
        	int d = b + orange[i];
        	if (d <= t && d >= s) {
        		count ++;
        	}
        }
        System.out.println(count);
        in.close();
	}
}
