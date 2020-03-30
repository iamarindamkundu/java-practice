package closest_numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int difference = 2147483647;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int value = Math.abs(a[i] - a[j]);
                    if (difference > value) {
                        difference = value;
                        list = new ArrayList<Integer>();
                        list.add(a[i]);
                        list.add(a[j]);
                    }
                    else if (difference == value && !list.contains(a[i]) && !list.contains(a[j])) {
                        list.add(a[i]);
                        list.add(a[j]);
                    }
                }
            }
        }
        Collections.sort(list);
        for (int item : list) {
            System.out.print(item + " ");
        }
        sc.close();
    }
}
