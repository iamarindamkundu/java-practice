package insertion_sort_advanced_analysis;

import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int[] ar = new int[n];
            for(int j=0;j<n;j++){
                ar[j]=in.nextInt();
                //System.err.println(ar[j]);
            }
            long c = insertSort(ar);      
            System.out.println(c);
        }
        in.close();
}
    
    
    public static long insertSort(int[] ar)
    {
         long count = 0;
        // Compute the required count
         for (int i = 1; i < ar.length; i++) {
             for (int j = 0; j < i ; j++) {
                 if (ar[i] < ar[j]) {
                     count ++;
                     int temp = ar[i];
                     ar[i] = ar[j];
                     ar[j] = temp;
                 }
             }
         }
        return count;
        
    }
}
