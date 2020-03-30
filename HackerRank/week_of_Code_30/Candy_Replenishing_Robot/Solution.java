package Candy_Replenishing_Robot;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        // your code goes here
        int j = 0, b = n, count = 0;
        for (int i = 0; i < c.length; i++) {
            b -= c[i];
            j++;
            if (b < 5 && j < t) {
            	count += (n - b);
                b += (n - b);
                
                System.out.println(b);
            }
        }
        System.out.println(count);
    }
}
